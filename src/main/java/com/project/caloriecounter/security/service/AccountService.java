package com.project.caloriecounter.security.service;

import com.project.caloriecounter.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAll();
    Account getById(Long id);
    //Account create(Account account);
    Account update(Account account);
    void deleteById(Long id);
}
