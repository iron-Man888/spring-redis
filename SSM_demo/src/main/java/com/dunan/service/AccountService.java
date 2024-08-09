package com.dunan.service;

import com.dunan.pojo.Account;

import java.util.List;


public interface AccountService {

    List<Account> selectAccount();

    void addAccount(Account account);

    void updateAccount(Account account);

    Account findAccount(Integer id);

    void deleteAccount(Integer id);
}
