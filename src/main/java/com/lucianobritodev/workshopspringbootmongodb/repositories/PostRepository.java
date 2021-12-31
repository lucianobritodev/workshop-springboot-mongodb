package com.lucianobritodev.workshopspringbootmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucianobritodev.workshopspringbootmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
