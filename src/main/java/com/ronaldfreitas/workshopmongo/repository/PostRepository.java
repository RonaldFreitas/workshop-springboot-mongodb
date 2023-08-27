package com.ronaldfreitas.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ronaldfreitas.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
