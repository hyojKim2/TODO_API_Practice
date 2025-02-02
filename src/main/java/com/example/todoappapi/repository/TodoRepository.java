package com.example.todoappapi.repository;

import com.example.todoappapi.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface TodoRepository {
    Todo create(Todo todo);
    Map<Long, Todo> readAll();

    Todo readOne(Long id);

    void update(Todo todo);
    void delete(Long id);
}
