package com.oluwaseyi.user.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwaseyi.user.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
