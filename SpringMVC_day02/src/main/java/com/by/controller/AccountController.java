package com.by.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/upload")
    public String upload(MultipartFile head, HttpServletRequest request) throws IOException {

        //1.获取上传目录
        //getRealPath(String path)：获得服务器的磁盘路径
        String path = request.getSession().getServletContext().getRealPath("/head/");
        System.out.println(path);
        //2.如果目录不存在则创建
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        //3.上传
        //获得文件名
        String filename = head.getOriginalFilename();
        head.transferTo(new File(path,filename));
        return "success";
    }

}
