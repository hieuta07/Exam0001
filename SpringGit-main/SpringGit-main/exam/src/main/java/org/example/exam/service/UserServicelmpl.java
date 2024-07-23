package org.example.exam.service;


import org.example.exam.dao.UserRepository;
import org.example.exam.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicelmpl implements UserService{
    private UserRepository userRepository;

    @Autowired
    public UserServicelmpl(UserRepository theUserRepository) {userRepository = theUserRepository;}

    @Override
    public List<User> findAll() {
        return userRepository.findAllByOrderByNameAsc();
    }

    @Override
    public User findById(int theId) {
        Optional<User> result = userRepository.findById(theId);

        User theUser = null;

        if (result.isPresent()) {
            theUser = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find user id - " + theId);
        }

        return theUser;
    }

    @Override
    public void save(User theUser) {
        userRepository.save(theUser);
    }

    @Override
    public void deleteById(int theId) {
        userRepository.deleteById(theId);
    }
}
