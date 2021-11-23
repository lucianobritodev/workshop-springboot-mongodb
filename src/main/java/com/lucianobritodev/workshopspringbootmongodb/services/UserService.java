package com.lucianobritodev.workshopspringbootmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucianobritodev.workshopspringbootmongodb.domain.User;
import com.lucianobritodev.workshopspringbootmongodb.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
}
