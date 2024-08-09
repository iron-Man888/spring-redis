package com.by.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(){
        //ModelAndView：封装了传递到页面的数据和跳转的视图
        ModelAndView mv = new ModelAndView();

        //request.setAttribute("msg", "师姐你好");
        mv.addObject("msg","helloWorld");//添加数据

        //request.getDispatch("success.jsp").forward(request, response);
        mv.setViewName("success");// 设置跳转的页面

        return mv;
    }
}
