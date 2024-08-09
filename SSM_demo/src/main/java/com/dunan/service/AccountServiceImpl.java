package com.dunan.service;

import com.dunan.mapper.AccountMapper;
import com.dunan.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> selectAccount() {
        return accountMapper.selectAccount();
    }

    @Override
    public void addAccount(Account account) {
        accountMapper.addAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountMapper.updateAccount(account);
    }

    @Override
    public Account findAccount(Integer id) {
        return accountMapper.findAccount(id);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountMapper.deleteAccount(id);
    }
}
