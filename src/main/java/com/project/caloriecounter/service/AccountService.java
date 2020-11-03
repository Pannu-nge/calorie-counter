package com.project.caloriecounter.service;

import com.project.caloriecounter.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAll();
    Account getByUsername(String username);
    Account create(Account account);
    Account update(Account account);
    void deleteByUsername(String username);
}
