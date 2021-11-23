package com.lucianobritodev.workshopspringbootmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucianobritodev.workshopspringbootmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
