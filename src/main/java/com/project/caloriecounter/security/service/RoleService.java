package com.project.caloriecounter.security.service;

import com.project.caloriecounter.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAll();
    Role getById(Long id);
    Role create(Role role);
    Role update(Role role);
    void deleteById(Long id);
}
