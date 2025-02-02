package com.example.todoappapi.repository;

import com.example.todoappapi.entity.Todo;

import java.util.List;
import java.util.Optional;


public class TodoRepositoryImpl implements TodoRepository{
    List<Todo> todoList;

    @Override
    public Todo save(Todo todo) {
        todoList.add(todo);
        return todo;
    }

    @Override
    public List<Todo> findAll() {
        return todoList;
    }

    @Override
    public Optional<Todo> findByTitle(String title) {
        return Optional.empty();
    }
}
