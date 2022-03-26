package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();
    Role getRoleByID(Long id);
    Role getRoleByRole(String role);
    void addRole(Role role);
}
