package org.scoula.ex02;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ResponseServlet", urlPatterns = {"/response"})
public class ResponseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("ResponseServlet 요청 성공");
        out.println("</body></html>");
    }
}
