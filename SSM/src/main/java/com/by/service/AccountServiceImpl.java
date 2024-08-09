package com.by.service;

import com.by.mapper.AccountMapper;
import com.by.pojo.Account;
import com.by.pojo.FuzzyAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> selectAccount() {
        return accountMapper.selectAccount();
    }

    @Override
    public void deleteAccount(Integer id) {
        accountMapper.deleteAccount(id);
    }

    @Override
    public void insertAccount(Account account) {
        accountMapper.insertAccount(account);
    }

    @Override
    public Account findAccountById(Integer id) {
        return accountMapper.findAccountById(id);
    }

    @Override
    public void updateAccount(Account account) {
        accountMapper.updateAccount(account);
    }

    @Override
    public List<Account> fuzzyAccount(FuzzyAccount fuzzyAccount) {
        return accountMapper.fuzzyAccount(fuzzyAccount);
    }
}
