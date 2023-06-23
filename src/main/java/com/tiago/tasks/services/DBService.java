package com.tiago.tasks.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.tasks.domain.Todo;
import com.tiago.tasks.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "corrida", "correr no parque", LocalDateTime.parse("25/03/2023 10:45", formatter),
				false);
		todoRepository.save(t1);

	}

}
