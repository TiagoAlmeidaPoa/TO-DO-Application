package com.tiago.tasks.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

	public void instanciaBaseDeDados() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "corrida", "correr no parque", sdf.parse("25/03/2023"), true);
		Todo t2 = new Todo(null, "estudar", "estudar java", sdf.parse("26/06/2023"), false);
		Todo t3 = new Todo(null, "nadar", "aula de natação no club", sdf.parse("27/06/2023"), false);
		Todo t4 = new Todo(null, "skate", "andar de skate na pista", sdf.parse("28/06/2023"), false);
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}

}
