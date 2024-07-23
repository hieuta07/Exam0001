package org.example.exam.dao;

import org.example.exam.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    // that's it ... no need to write any code LOL!

    // add a method to sort by last name
    public List<User> findAllByOrderByNameAsc();
}
