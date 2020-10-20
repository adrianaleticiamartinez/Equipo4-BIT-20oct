package com.dev.usersapp.services;

import com.dev.usersapp.entities.Role;
import com.dev.usersapp.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RolRepository repository;

    public List<Role> getRoles(){
        return repository.findAll();
    }

    public Role createRole(Role role){
        return repository.save(role);
    }

    public Role updateRole(Integer roleId, Role role) {
        Optional<Role> result = repository.findById(roleId);
        if (result.isPresent()) {
            return repository.save(role);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Role id %d doesnt exist", roleId));
        }
    }

    public void deleteRol(Integer id) {
        Optional<Role> result = repository.findById(id);
        if(result.isPresent()){
            repository.delete(result.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Role id %d doesnt exist", id));
        }
    }
}
