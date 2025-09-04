package com.example.BebkaSpringProject.service;

import com.example.BebkaSpringProject.model.User;
import com.example.BebkaSpringProject.userDto.UserDto;
import org.springframework.data.domain.Page;

public interface IUserService {
    User addUser(User user);
    void deleteUser(Long id);
    Page<UserDto> getAllUsers(int page, int size);
    User updateUser(Long id, String name,String email,String password);

}
