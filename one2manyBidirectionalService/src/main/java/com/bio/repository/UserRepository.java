package com.bio.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bio.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}