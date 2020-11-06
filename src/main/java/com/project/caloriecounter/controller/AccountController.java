package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.Account;
import com.project.caloriecounter.security.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<Account> getAll(){return accountService.getAll();}

    @GetMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Account getById(@PathVariable Long id){
        return accountService.getById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Account create(@RequestBody Account account){
        return accountService.create(account);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @PreAuthorize("hasRole('ADMIN')")
    public Account update(@RequestBody Account account){
        return accountService.update(account);
    }

    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteById(@PathVariable Long id){
        accountService.deleteById(id);
    }
}
