package com.tiago.tasks.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

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

		Todo t1 = new Todo(null, "corrida", "correr no parque", LocalDateTime.parse("25/03/2023 10:45", formatter), true);
		Todo t2 = new Todo(null, "estudar", "estudar java", LocalDateTime.parse("26/06/2023 22:00", formatter), false);
		Todo t3 = new Todo(null, "nadar", "aula de natação no club", LocalDateTime.parse("27/06/2023 10:00", formatter), false);
		Todo t4 = new Todo(null, "skate", "andar de skate na pista", LocalDateTime.parse("28/06/2023 16:20", formatter), false);
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}

}
