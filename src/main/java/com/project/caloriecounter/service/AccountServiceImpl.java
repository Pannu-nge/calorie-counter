package com.project.caloriecounter.service;

import com.project.caloriecounter.model.Account;
import com.project.caloriecounter.repository.AccountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAll(){return accountRepository.findAll();}

    @Override
    public Account getByUsername(String username){
        return accountRepository.getOne(username);
    };

    @Override
    public Account create(Account account){
        return accountRepository.save(account);
    };

    @Override
    public Account update(Account account){
        Account oldAccount = accountRepository.getOne(account.getUsername());
        BeanUtils.copyProperties(account, oldAccount);
        return accountRepository.saveAndFlush(oldAccount);
    };

    @Override
    public void deleteByUsername(String username){
        accountRepository.deleteById(username);
    };
}
