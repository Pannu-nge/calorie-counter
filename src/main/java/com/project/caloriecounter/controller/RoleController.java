package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.Person;
import com.project.caloriecounter.model.Role;
import com.project.caloriecounter.repository.RoleRepository;
import com.project.caloriecounter.service.RoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAll(){return roleService.getAll(); }

    @GetMapping("{id}")
    public Role getById(@PathVariable Long id){
        return roleService.getById(id);
    }

    @PostMapping
    public Role create(@RequestBody Role role){
        return roleService.create(role);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Role update(@RequestBody Role role){
        return roleService.update(role);
    }

    @RequestMapping(path = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        roleService.deleteById(id);
    }

}
