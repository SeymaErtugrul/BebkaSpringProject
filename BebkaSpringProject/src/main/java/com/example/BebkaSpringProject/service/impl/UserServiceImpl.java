package com.example.BebkaSpringProject.service.impl;

import com.example.BebkaSpringProject.model.Employee;
import com.example.BebkaSpringProject.model.User;
import com.example.BebkaSpringProject.repository.UserRepository;
import com.example.BebkaSpringProject.service.IUserService;
import com.example.BebkaSpringProject.userDto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user= userRepository.findById(id) .orElseThrow(() -> new RuntimeException("Böyle bir kullanıcı yok"));
        userRepository.delete(user);
    }

    @Override
    public Page<UserDto> getAllUsers(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return userRepository.findAll(pageable)
                .map(user -> new UserDto(
                        user.getId(),
                        user.getUsername(),
                        user.getEmail()
                ));
    }

    @Override
    public User updateUser(Long id, String name, String email, String password) {
        User user= userRepository.findById(id) .orElseThrow(() -> new RuntimeException(" Böyle bir kullanıcı yok"));
        user.setUsername(name);
        user.setEmail(email);
        return userRepository.save(user);
    }


}
