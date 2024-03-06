package com.kichibekov.spring_boot.service;


import com.kichibekov.spring_boot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getUsers();

    void clearUsers();

    User getUserById(long id);
}
