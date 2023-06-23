package com.tiago.tasks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiago.tasks.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{

}
