package com.lucianobritodev.workshopspringbootmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucianobritodev.workshopspringbootmongodb.domain.Post;
import com.lucianobritodev.workshopspringbootmongodb.repositories.PostRepository;
import com.lucianobritodev.workshopspringbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	
	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException(id));
	}
}
