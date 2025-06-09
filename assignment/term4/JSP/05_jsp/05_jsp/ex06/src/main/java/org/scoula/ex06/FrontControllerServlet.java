package org.scoula.ex06;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.scoula.ex06.command.Command;
import org.scoula.ex06.controller.HomeController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="frontControllerServlet", value="/")
public class FrontControllerServlet extends HttpServlet {

    Map<String, Command> getMap;
    Map<String, Command> postMap;

    String prefix = "/WEB-INF/jsp/";
    String suffix = ".jsp";
    HomeController homeController = new HomeController();

    @Override
    public void init() throws ServletException {
        getMap = new HashMap<>();
        postMap = new HashMap<>();

        getMap.put("/", homeController::getIndex);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Command command = getCommand(req);
        if(command != null) {
            execute(command, req, resp);
        } else { // 404 에러 처리
            String view = prefix + "404" + suffix;
            RequestDispatcher dis = req.getRequestDispatcher(view);
            dis.forward(req, resp);
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private String getCommandName(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        return requestURI.substring(contextPath.length());
    }
    private Command getCommand(HttpServletRequest request) {
        String commandName = getCommandName(request);
        Command command;
        if(request.getMethod().equalsIgnoreCase("GET")) {
            command = getMap.get(commandName);
        } else {
            command = postMap.get(commandName);
        }
        return command;
    }

    private void execute(Command command, HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String viewName = command.execute(request, response);

        if(viewName.startsWith("redirect:")) { // redirect 처리
            response.sendRedirect(viewName.substring("redirect:".length()));
        } else { // forward 처리
            String view = prefix + viewName + suffix;
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request, response);
        }

    }

}
