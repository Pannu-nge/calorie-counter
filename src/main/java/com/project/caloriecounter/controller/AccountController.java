package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.Account;
import com.project.caloriecounter.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAll(){return accountService.getAll();}

    @GetMapping("{username}")
    public Account getByUsername(@PathVariable String username){
        return accountService.getByUsername(username);
    }

    @PostMapping
    public Account create(@RequestBody Account account){
        return accountService.create(account);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Account update(@RequestBody Account account){
        return accountService.update(account);
    }

    @RequestMapping(path = "{delete/username}", method = RequestMethod.DELETE)
    public void deleteByUsername(@PathVariable String username){
        accountService.deleteByUsername(username);
    }
}
