package com.by.controller;

import com.by.pojo.User;
import com.by.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping("/register")
    public String register(User user) {
        userService.insertUser(user);
        return "redirect:/login.jsp";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session) {
        User user = userService.getUser(username, password);


        if (user != null) {
            session.setAttribute("user",user);

            return "redirect:/account/selectAccount";
        }
        return "redirect:/login.jsp";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();//清空session
        return "redirect:/login.jsp";
    }



}
