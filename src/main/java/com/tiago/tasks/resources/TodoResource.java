package com.tiago.tasks.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.tasks.domain.Todo;
import com.tiago.tasks.services.TodoService;

@RestController
@RequestMapping(value = "todos")
public class TodoResource {

	@Autowired
	private TodoService todoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Todo> findById(@PathVariable Integer id){
		Todo obj = todoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}