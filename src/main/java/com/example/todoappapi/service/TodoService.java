package com.example.todoappapi.service;

import com.example.todoappapi.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private final TodoRepository todoRepository ;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository=todoRepository;
    }
}
