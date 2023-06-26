package com.tiago.tasks.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.tasks.domain.Todo;
import com.tiago.tasks.repositories.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repository;
	
	public Todo findById(Integer id) {
		Optional<Todo> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Todo> findAllOpen() {
		return repository.findAllOpen();
	}

	public List<Todo> findAllClose() {
		return repository.findAllClose();
	}

}
