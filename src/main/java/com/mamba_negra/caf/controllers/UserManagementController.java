package com.mamba_negra.caf.controllers;

import java.util.Collections;
import java.util.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserManagementController {
    @GetMapping
    public Map<String, String> getUsers() {
        return Collections.singletonMap("msg", "Get all users");
    }

    @GetMapping("/{id}")
    public Map<String, String> getUserById(@PathVariable("id") String id) {
        return Collections.singletonMap("msg", "Get user with id: " + id);
    }

    @PostMapping
    public Map<String, String> createUser() {
        return Collections.singletonMap("msg", "Create user");
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteUser(@PathVariable String id) {
        return Collections.singletonMap("msg", "Delete user with id: " + id);
    }

    @PutMapping("/{id}")
    public Map<String, String> updateUser(@PathVariable String id) {
        return Collections.singletonMap("msg", "Update user with id: " + id);
    }
}
