package com.example.BebkaSpringProject.service;

import com.example.BebkaSpringProject.model.User;
import com.example.BebkaSpringProject.repository.UserRepository;
import com.example.BebkaSpringProject.userDto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService (UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

    public User addUser(User user)
    {
        return userRepository.save(user);
    }

    public List<UserDto> findAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(user -> new UserDto(user.getId(), user.getUsername(), user.getEmail()))
                .collect(Collectors.toList());
    }
}
