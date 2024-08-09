package com.by.mapper;

import com.by.pojo.Account;
import com.by.pojo.FuzzyAccount;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {
    List<Account> selectAccount();

    void deleteAccount(Integer id);

    void insertAccount(Account account);

    Account findAccountById(Integer id);

    void updateAccount(Account account);


    List<Account> fuzzyAccount(FuzzyAccount fuzzyAccount);
}
