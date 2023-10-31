package com.example.reviewservicepilot.user.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.reviewservicepilot.user.application.UserService;
import com.example.reviewservicepilot.user.domain.User;
import com.example.reviewservicepilot.user.dto.request.CreateUserRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping("/sign-up")
	public ResponseEntity<User> signUp(@RequestBody CreateUserRequest createRequestDto) {
		User user = createRequestDto.toEntity();
		User createdUser = userService.createUser(user);

		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<User> signUp(@PathVariable Long userId) {
		User createdUser = userService.getUserOrThrow(userId);

		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}

	@GetMapping("/user")
	public ResponseEntity<List<User>> signUp() {
		List<User> users = userService.getUsers();

		return new ResponseEntity<List<User>>(users, HttpStatus.CREATED);
	}

}
