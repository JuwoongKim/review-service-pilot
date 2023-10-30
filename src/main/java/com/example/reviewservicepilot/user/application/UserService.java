package com.example.reviewservicepilot.user.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.reviewservicepilot.user.domain.User;
import com.example.reviewservicepilot.user.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public User createUser(User user) {
		User createdUser = userRepository.save(user);

		createdUser.getEmail();

		System.out.println(createdUser.getCreatedDate());
		return createdUser;
	}

	public User getUserOrThrow(Long userId) {
		User user = userRepository.findById(userId).orElseThrow(EntityNotFoundException::new);

		return user;
	}

	public List<User> getUsers() {
		List<User> userList = userRepository.findAll();

		return userList;
	}

}
