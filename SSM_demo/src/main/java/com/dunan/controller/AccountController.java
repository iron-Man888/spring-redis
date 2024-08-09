package com.dunan.controller;

import com.dunan.pojo.Account;
import com.dunan.service.AccountService;
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
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;


    @RequestMapping("/selectAccount")
    public String selectAccount(Model model) {
        List<Account> accountList = accountService.selectAccount();
        model.addAttribute("accountList", accountList);
        return "account_list";
    }

    @RequestMapping("/toAddAccount")
    public String toAddAccount() {
        return "account_add";
    }

    @RequestMapping("/addAccount")
    public String addAccount(Account account,
                             MultipartFile uploadFile,
                             HttpServletRequest request) throws IOException {
        String path = request.getSession()
                .getServletContext().getRealPath("static/img/");
        System.out.println(path);
        if (!uploadFile.isEmpty()) {
            File file = new File(path);
            if (!file.exists()) {
                file.mkdirs();
            }
            String filename = uploadFile.getOriginalFilename();
            uploadFile.transferTo(new File(path, filename));
            account.setHead(filename);
        }
        accountService.addAccount(account);
        return "redirect:/account/selectAccount";
    }

    @RequestMapping("/toUpdateAccount/{id}")
    public String toUpdateAccount(@PathVariable Integer id, Model model) {
        Account account = accountService.findAccount(id);
        model.addAttribute("account", account);

        return "account_update";
    }

    @RequestMapping("/updateAccount")
    public String updateAccount(Account account,
                                MultipartFile uploadFile,
                                HttpServletRequest request) throws IOException {
        String path = request.getSession()
                .getServletContext().getRealPath("static/img/");
        System.out.println(path);
        if (!uploadFile.isEmpty()) {
            File file = new File(path);
            if (!file.exists()) {
                file.mkdirs();
            }
            String filename = uploadFile.getOriginalFilename();
            uploadFile.transferTo(new File(path, filename));
            account.setHead(filename);
        }
        accountService.updateAccount(account);
        return "redirect:/account/selectAccount";
    }

    @RequestMapping("/deleteAccount/{id}")
    public String deleteAccount(@PathVariable Integer id) {
        accountService.deleteAccount(id);
        return "redirect:/account/selectAccount";
    }


}
