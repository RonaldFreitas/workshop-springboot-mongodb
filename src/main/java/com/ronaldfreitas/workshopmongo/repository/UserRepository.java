package com.ronaldfreitas.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ronaldfreitas.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

	
}
