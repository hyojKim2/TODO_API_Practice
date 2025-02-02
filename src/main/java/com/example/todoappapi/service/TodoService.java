package com.example.todoappapi.service;

import com.example.todoappapi.entity.Todo;
import com.example.todoappapi.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class TodoService {
    private final TodoRepository todoRepository ;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository=todoRepository;
    }

    public Todo create(Todo todo) {
        Todo createTodo = todoRepository.create(todo);
        return createTodo;
    }

    public Todo readOne(Long id) {
        Todo readTodo=todoRepository.readOne(id);
        return readTodo;
    }

    public Map<Long, Todo> readAll(){
        Map<Long, Todo> todoMap =todoRepository.readAll();
        return todoMap;
    }

    public void update(Todo todo) {
        todoRepository.update(todo);
    }
    public void delete(Long id){
        todoRepository.delete(id);
    }

}
