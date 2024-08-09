package com.by.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/demo")
public class DemoTest {

    @RequestMapping("/test1")
    public String test1(Model model) {
        model.addAttribute("msg", "凤凰笑田鸡");
        return "success";
    }

    @RequestMapping("/test2")
    public String test2(Model model) {
        model.addAttribute("msg", "凤凰笑田鸡");
        return "forward:/demo/test4";
    }

    @RequestMapping("/test3")
    public String test3(Model model) {
        model.addAttribute("msg", "凤凰笑田鸡");
        return "redirect:/demo/test4";
    }

    @RequestMapping("/test4")
    public String test4(HttpServletRequest request) {
        request.getAttribute("msg");
        return "success";
    }

    @RequestMapping("/test5")
    public String test5(@RequestParam("name") String name, Model model) {
        System.out.println("name：" + name);
        model.addAttribute("msg", name);
        return "success";
    }

    @GetMapping("test6")
    public String test6(@RequestParam("name") String name,
                        @RequestParam("age") Integer age,
                                            Model model) {
        model.addAttribute("msg", "msg===" + name + "--" + age);
        System.out.println("msg===" + name + "--" + age);
        return "success";
    }

}
