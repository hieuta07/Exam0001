package org.example.exam.service;

import org.example.exam.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public User findById(int theId);

    public void deleteById(int theId);

    public void save(User theUser);
}
