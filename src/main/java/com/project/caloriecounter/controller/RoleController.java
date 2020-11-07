package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.Role;
import com.project.caloriecounter.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<Role> getAll(){return roleService.getAll(); }

    @GetMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Role getById(@PathVariable Long id){
        return roleService.getById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Role create(@RequestBody Role role){
        return roleService.create(role);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @PreAuthorize("hasRole('ADMIN')")
    public Role update(@RequestBody Role role){
        return roleService.update(role);
    }

    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteById(@PathVariable Long id){
        roleService.deleteById(id);
    }

}
