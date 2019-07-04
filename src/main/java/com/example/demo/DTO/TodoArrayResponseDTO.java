package com.example.demo.DTO;

import com.example.demo.entities.Todo;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class TodoArrayResponseDTO {

    private List<Todo> todos;

    private Integer size;

    public TodoArrayResponseDTO (@NonNull List<Todo> input){

        this.todos = input;
        this.size = input.size();
    }
}
