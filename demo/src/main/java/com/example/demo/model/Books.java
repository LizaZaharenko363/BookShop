package com.example.demo.model;

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

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", pages=" + pages +
                '}';
    }
}
