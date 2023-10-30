package com.example.reviewservicepilot.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reviewservicepilot.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
