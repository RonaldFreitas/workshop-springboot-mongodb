package com.ronaldfreitas.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronaldfreitas.workshopmongo.domain.User;
import com.ronaldfreitas.workshopmongo.dto.UserDTO;
import com.ronaldfreitas.workshopmongo.repository.UserRepository;
import com.ronaldfreitas.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objdt) {
		return new User(objdt.getId(),objdt.getName(),objdt.getEmail());
	}
}
