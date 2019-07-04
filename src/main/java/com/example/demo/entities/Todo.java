package com.example.demo.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId(){
        return this.id;
    }
    private String name;
    private Date creationDate;

    private boolean isImportant;


    private boolean isFinished;

    private Todo(){}

    public Todo(String name, boolean isImportant){
        this.name = name;
        this.isImportant = isImportant;
        this.creationDate = Calendar.getInstance().getTime();
        this.isFinished = false;
    }

}

