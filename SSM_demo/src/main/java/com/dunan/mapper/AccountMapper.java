package com.dunan.mapper;

import com.dunan.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {
    List<Account> selectAccount();

    void addAccount(Account account);

    void updateAccount(Account account);

    Account findAccount(Integer id);

    void deleteAccount(Integer id);

}
