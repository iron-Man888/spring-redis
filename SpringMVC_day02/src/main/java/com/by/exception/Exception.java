package com.by.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class Exception implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response,
                                         Object handler,
                                         java.lang.Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",ex.getMessage());
        modelAndView.setViewName("exception");
        return modelAndView;
    }
}
