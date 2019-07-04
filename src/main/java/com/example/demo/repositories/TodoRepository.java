package com.example.demo.repositories;

import com.example.demo.entities.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Long> {

    public ArrayList<Todo> findAll();
}
