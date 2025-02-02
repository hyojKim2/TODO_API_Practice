package com.example.todoappapi.controller;

import com.example.todoappapi.entity.Todo;
import com.example.todoappapi.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService=todoService;
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        Todo createTodo = todoService.create(todo);
        return createTodo;
    }

    @GetMapping("/{id}")
    public Todo readOne(@PathVariable Long id ){
        Todo todo = todoService.readOne(id);
        return todo;
    }

    @GetMapping
    public Map<Long, Todo> readAll(){
        Map<Long, Todo> todoMap = todoService.readAll();
        return todoMap;
    }

    //update시 PutMapping
    @PutMapping("/{id}")
    public void update(@RequestBody Todo todo) {
        todoService.update(todo);
    }

    //delete시 DeleteMapping
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        todoService.delete(id);
    }



}
