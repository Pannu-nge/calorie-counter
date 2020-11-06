package com.project.caloriecounter.security.service;

import com.project.caloriecounter.model.Role;
import com.project.caloriecounter.repository.RoleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAll(){
        return roleRepository.findAll();
    }

    @Override
    public Role getById(Long id){
        return roleRepository.getOne(id);
    }

    @Override
    public Role create(Role role){
        return roleRepository.save(role);
    }

    @Override
    public Role update(Role role){
        Role oldRole = roleRepository.getOne(role.getId());
        BeanUtils.copyProperties(role, oldRole, "id");
        return roleRepository.saveAndFlush(oldRole);
    }

    @Override
    public void deleteById(Long id){
        roleRepository.deleteById(id);
    }

}
