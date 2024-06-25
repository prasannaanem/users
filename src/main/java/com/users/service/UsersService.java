package com.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.entity.Users;
import com.users.repository.UsersRepo;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepo usersRepo;
	
	
	public Users saveUser(Users users) {
		
		return usersRepo.save(users);
		
	}

	
	public List<Users> getUsers(){
		return usersRepo.findAll();
	}
}
