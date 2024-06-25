package com.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.entity.Users;
import com.users.service.UsersService;

@RestController
@RequestMapping("/user")
public class UsersController {
	
	@Autowired
	private UsersService usersService;

	@PostMapping("/save")
	public Users saveUsers (@RequestBody Users users) {
		return usersService.saveUser(users);
	}
	@GetMapping("/get")
	public List<Users> getUsers(){
		return usersService.getUsers();
	}
}
