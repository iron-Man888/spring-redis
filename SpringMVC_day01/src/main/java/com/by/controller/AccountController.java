package com.by.controller;

import com.by.pojo.Account;
import com.by.pojo.AjaxResult;
import com.by.pojo.Dog;
import com.by.pojo.HuQiuXie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping(value = "findUser"/*, method = RequestMethod.POST*/)
    public ModelAndView findUser() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "大河之剑天上来");// 添加数据
        mv.setViewName("success");// 设置跳转的页面
        return mv;

    }

    @GetMapping("findUser1")
    public ModelAndView findUser1() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "大河之剑天上来");// 添加数据
        mv.setViewName("success");// 设置跳转的页面
        return mv;
    }

    @GetMapping("findUser2")
    public String findUser2(Model model) {
        //添加数据
        model.addAttribute("msg", "message");
        /********转发************/
        return "forward:/account/findUser3";

        /**********重定向**************/
        //return "redirect:/account/findUser3";
    }

    @GetMapping("findUser3")
    public String findUser3(HttpServletRequest request) {
        Object msg = request.getAttribute("msg");
        System.out.println("msg===" + msg);
        return "success";
    }

    @GetMapping("findUser4")
    public String findUser4(String name, Model model) {
        System.out.println("name：" + name);
        model.addAttribute("msg", name);
        return "success";
    }

    @GetMapping("findUser5")
    public String findUser5(String name, Integer age, Model model) {
        model.addAttribute("msg", name);
        System.out.println("msg===" + name + "--" + age);
        return "success";
    }

    @RequestMapping("findUser6")
    public String findUser6(Account account, Model model) {
        System.out.println("msg===" + account);
        model.addAttribute("msg", account);
        return "success";
    }

    @RequestMapping("findUser7/{name}/{age}")
    public String findUser7(@PathVariable String name, @PathVariable Integer age, Model model) {
        System.out.println("msg===" + name + "----" + age);
        model.addAttribute("msg", name + "----" + age);
        return "success";
    }

    @RequestMapping("findUser8")
    public String findUser8(Account account, Model model) {
        System.out.println("msg===" + account);
        model.addAttribute("msg", account);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/saveAccount1")
    public AjaxResult saveAccount1(@RequestBody Account account) {
        System.out.println(account);
        return new AjaxResult(account, 200);
    }

    @ResponseBody
    @RequestMapping("/saveAccount2")
    public Map<String, Object> saveAccount2(@RequestBody Dog dog) {
        System.out.println(dog);
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", dog);
        map.put("status", 200);
        return map;
    }

    @ResponseBody
    @RequestMapping("/saveAccount3")
    public Map<String, Object> saveAccount3(@RequestBody HuQiuXie huQiuXie) {
        System.out.println(huQiuXie);
        HashMap<String, Object> map = new HashMap<>();
        map.put("wokao", "我爱你");
        map.put("smn", "一生一世");
        return map;
    }

    @RequestMapping("/findUser9")
    public String findUser9(HttpServletRequest request) {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println("name" + name + "age" + age);
        request.setAttribute("msg","name" + name + "age" + age);
        return "success";
    }

    @RequestMapping("/findUser10")
    public ModelAndView findUser10() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","大河之剑天上来");
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/findUser11")
    public String findUser11(Model model) {
        model.addAttribute("msg","大河之剑天上来");
        return "success";
    }

    @RequestMapping("/findUser12")
    public String findUser12(HttpServletRequest request) {
        request.setAttribute("msg","大河之剑天上来");
        return "success";
    }
}
