package com.tiago.tasks.resources;

import java.util.List;

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
	private TodoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Todo> findById(@PathVariable Integer id){
		Todo obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/open")
	public ResponseEntity<List<Todo>> listOpen(){
		return ResponseEntity.ok().body(service.findAllOpen());
	}
	
	@GetMapping(value = "/close")
	public ResponseEntity<List<Todo>> listClose(){
		return ResponseEntity.ok().body(service.findAllClose());
	}
	
	@GetMapping
	public ResponseEntity<List<Todo>> findAll(){
		List<Todo> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
