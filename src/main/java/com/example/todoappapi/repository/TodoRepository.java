package com.example.todoappapi.repository;

import com.example.todoappapi.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository {
    Todo save(Todo todo);
    List<Todo> findAll();

    Optional<Todo> findByTitle(String title);
}
