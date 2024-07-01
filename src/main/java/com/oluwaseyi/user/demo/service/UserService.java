package com.oluwaseyi.user.demo.service;



import java.util.List;
import java.util.Optional;

// import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oluwaseyi.user.demo.model.User;
import com.oluwaseyi.user.demo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
//   Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
//   Creates a new user using email & password
    public User saveUser(User user) {
        return userRepository.save(user);
    }


//   Get a single user from the database
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
    //   Edit users
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow();
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }

    // Delete user from the database
    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow();
        userRepository.delete(user);
    }
}

