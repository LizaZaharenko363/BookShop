package com.example.demo.model;

import lombok.*;

@Data
public class Books {
    private int id;
    private String name;
    private String author;
    private int yearPublishing;
    private int pages;

    public Books(int id, String name, String author, int yearPublishing, int pages) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
        this.pages = pages;
    }

}
