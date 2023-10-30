package com.example.reviewservicepilot.user.dto.request;

import com.example.reviewservicepilot.user.domain.User;

public record CreateUserRequest(String name, String email, String password) {

	public User toEntity() {
		return new User(name, email, password);
	}

}
