package com.ecoat.management.ECOATSpringApplication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecoat.management.ECOATSpringApplication.dto.LoginRequest;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class LoginController {

	@PostMapping("/login")
	public void login(@RequestBody LoginRequest loginRequest) {

	}
	
}
