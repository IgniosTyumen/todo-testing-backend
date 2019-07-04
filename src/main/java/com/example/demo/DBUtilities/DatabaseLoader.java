package com.example.demo.DBUtilities;

import com.example.demo.entities.Todo;
import com.example.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {


    private final TodoRepository repository;

    @Autowired
    public DatabaseLoader (TodoRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        this.repository.save(new Todo("Give him a work", true));
        this.repository.save(new Todo("He is awesome", true));
    }
}