package com.example.BebkaSpringProject.controller;

import com.example.BebkaSpringProject.model.Student;
import com.example.BebkaSpringProject.model.User;
import com.example.BebkaSpringProject.service.StudentService;
import com.example.BebkaSpringProject.service.UserService;
import com.example.BebkaSpringProject.userDto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }

    @GetMapping("/users")
    public List<UserDto> getAllUsers() {
        return userService.findAllUsers();
    }
}

