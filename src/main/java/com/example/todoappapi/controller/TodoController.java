package com.example.todoappapi.controller;

import com.example.todoappapi.entity.Todo;
import com.example.todoappapi.service.TodoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService=todoService;
    }




}
