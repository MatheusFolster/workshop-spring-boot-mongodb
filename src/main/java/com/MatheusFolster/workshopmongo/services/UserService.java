package com.MatheusFolster.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MatheusFolster.workshopmongo.domain.User;
import com.MatheusFolster.workshopmongo.repository.UserRepository;

@Service
public class UserService {
 
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
