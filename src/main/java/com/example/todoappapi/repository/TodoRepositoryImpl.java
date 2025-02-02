package com.example.todoappapi.repository;

import com.example.todoappapi.entity.Todo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class TodoRepositoryImpl implements TodoRepository{
    private final Map<Long, Todo> todoMap;

    public TodoRepositoryImpl() {
        this.todoMap = new HashMap<>();
    }


    @Override
    public Todo create(Todo todo) {
        todoMap.put(todo.getID(), todo);
        return todo;
    }

    @Override
    public Map<Long, Todo> readAll() {
        return todoMap;
    }

    @Override
    public Todo readOne(Long id) {
        return todoMap.get(id);
    }


    @Override
    public void update(Todo todo) {

    }

    @Override
    public void delete(Long id) {

    }
}
