package com.todos.rest.webservice.restfulwebservice.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJpaRepo extends JpaRepository<Todo, Long> {
	
	List<Todo> findByUsername(String username);

}
