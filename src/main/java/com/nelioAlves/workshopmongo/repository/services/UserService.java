package com.nelioAlves.workshopmongo.repository.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioAlves.workshopmongo.domain.User;
import com.nelioAlves.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository repo;
	
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
}
