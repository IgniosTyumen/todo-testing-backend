package com.example.demo.controllers;

import com.example.demo.DTO.TodoArrayResponseDTO;
import com.example.demo.entities.Todo;
import com.example.demo.repositories.TodoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {


    TodoRepository repository;

    @Autowired
    public TodoController(TodoRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
    }

    @GetMapping(value = "/mtodos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTodos() {
        ArrayList<Todo> result = repository.findAll();
        return ResponseEntity.ok()
                .body(new TodoArrayResponseDTO(result));


    }


}
