package com.tiago.tasks.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tiago.tasks.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{

	@Query("SELECT obj FROM Todo obj WHERE obj.finished = false ORDER BY obj.endDate")
	public List<Todo> findAllOpen();

}
