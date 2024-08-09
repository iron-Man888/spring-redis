package com.by.controller;

import com.by.pojo.Account;
import com.by.pojo.FuzzyAccount;
import com.by.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/selectAccount")
    public String selectAccount(Model model) {
        List<Account> accountList = accountService.selectAccount();
        model.addAttribute("accountList", accountList);
        return "account_select";
    }

    /**
     * void deleteAccount(Integer id);
     */
    @RequestMapping("/deleteAccount/{id}")
    public String deleteAccount(@PathVariable Integer id, Model model) {
        accountService.deleteAccount(id);
        return "redirect:/account/selectAccount";

    }

    @RequestMapping("/toInsertAccount")
    public String toInsertAccount() {
        return "account_insert";
    }

    @RequestMapping("/insertAccount")
    public String insertAccount(MultipartFile uploadFile,
                                Account account,
                                HttpServletRequest request) throws IOException {
        System.out.println(account);
        if (!uploadFile.isEmpty()) {

        //1.获取上传目录
        //getRealPath(String path)：获得服务器的磁盘路径
        String path = request.getSession().getServletContext().getRealPath("/img/");
        System.out.println(path);
        //2.如果目录不存在则创建
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        //3.上传
        //获得文件名
        String filename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File(path, filename));
        account.setHead(filename);
//        System.out.println(filename);
//        System.out.println(account);
        }
        accountService.insertAccount(account);
        return "redirect:/account/selectAccount";
    }

    @RequestMapping("/toUpdateAccount/{id}")
    public String toUpdateAccount(@PathVariable Integer id, Model model) {
        Account account = accountService.findAccountById(id);
        System.out.println("==================================================");
        System.out.println(account);
        model.addAttribute("account", account);
        return "/account_update";
    }

    @RequestMapping("/updateAccount")
    public String updateAccount(Account account,
                                MultipartFile uploadFile,
                                HttpServletRequest request) throws IOException {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(account);
        if (!uploadFile.isEmpty()) {

        //1.获取上传目录
        //getRealPath(String path)：获得服务器的磁盘路径
        String path = request.getSession().getServletContext().getRealPath("/img/");
        System.out.println(path);
        //2.如果目录不存在则创建
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        //3.上传
        //获得文件名
        String filename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File(path, filename));
        account.setHead(filename);
        System.out.println("======================================");
        System.out.println(account);
        }
//        执行修改
        accountService.updateAccount(account);
        return "redirect:/account/selectAccount";

    }

    @RequestMapping("/fuzzyAccount")
    public String fuzzyAccount(FuzzyAccount fuzzyAccount,Model model){
        List<Account> accountList= accountService.fuzzyAccount(fuzzyAccount);

        model.addAttribute("accountList",accountList);
        return "account_select";
    }


}
