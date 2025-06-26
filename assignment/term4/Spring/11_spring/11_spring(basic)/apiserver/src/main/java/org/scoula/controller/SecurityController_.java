package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.scoula.security.account.domain.CustomUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Log4j2


public class SecurityController_ {






    @GetMapping("/member")
    public void doMember(Principal principal,
                         Authentication authentication,
                         @AuthenticationPrincipal CustomUser customUser
    ) {
        log.info("logined member details info >>" + principal);
        log.info("logined member details info >>" + principal.getName());
        UserDetails principal2 = (UserDetails) authentication.getPrincipal();
        log.info("logined UserDetails details info >>" + principal2.getAuthorities());
        log.info("logined UserDetails details info >>" + principal2.getPassword());
        log.info("logined UserDetails details info >>" + principal2.getUsername());
        System.out.println("---------------------------");
        log.info("logined customUser details info >>" + customUser);
        log.info("logined customUser details info >>" + customUser.getMember());
        log.info("logined customUser details info >>" + customUser.getUsername());
        log.info("logined customUser details info >>" + customUser.getPassword());
        log.info("logined customUser details info >>" + customUser.getAuthorities());
    }

    @GetMapping("/logout")
    public void logout() {
        log.info("logout page");
    }

    @GetMapping("/login")
    public void login() {
        log.info("login page");
    }

    @GetMapping("/all")
    public void doAll() {
        log.info("do all can access everybody");
    }














    @GetMapping("/admin")
    public void doAdmin(@AuthenticationPrincipal CustomUser customUser) {


    }

}
