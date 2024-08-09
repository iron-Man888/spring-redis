package com.by.service;

import com.by.pojo.Account;
import com.by.pojo.FuzzyAccount;

import java.util.List;

public interface AccountService {
    List<Account> selectAccount();

    void deleteAccount(Integer id);

    void insertAccount(Account account);

    Account findAccountById(Integer id);

    void updateAccount(Account account);

    List<Account> fuzzyAccount(FuzzyAccount fuzzyAccount);
}
