package com.project.caloriecounter.security.service;

import com.project.caloriecounter.model.Account;
import com.project.caloriecounter.repository.AccountRepository;
import com.project.caloriecounter.repository.PersonRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Account> getAll(){return accountRepository.findAll();}

    @Override
    public Account getById(Long id){
        return accountRepository.getOne(id);
    };

    /*@Override
    public Account create(Account account){
        return accountRepository.save(account);
    };*/

    @Override
    public Account update(Account account){
        Account oldAccount = accountRepository.getOne(account.getId());
        BeanUtils.copyProperties(account, oldAccount, "id", "password");
        return accountRepository.saveAndFlush(oldAccount);
    };

    @Override
    public void deleteById(Long id){
        Account account = accountRepository.getOne(id);
        accountRepository.deleteById(id);
        personRepository.deleteByAccount_Person_Id(account.getPerson().getId());
    };
}
