package com.by.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ExceptionController {

    @RequestMapping("/globalException")
    public String exceptionTest(Model model) {
        int i = 0 / 0;
        return "success";

    }
}
