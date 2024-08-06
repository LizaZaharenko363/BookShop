package com.example.demo.controller;

import com.example.demo.model.Books;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@RequestMapping("/books")
@RestController
public class NewController {

    private List<Books> engBooks;
    private List<Books> ukrBooks;

    @PostConstruct
    public void init() {
        engBooks = new ArrayList<>();
        engBooks.add(new Books(1, "Harry Potter and the Order of the Phoenix", "J.K. Rowling", 2003, 766));
        engBooks.add(new Books(2, "Pride and Prejudice", "Jane Austen", 1813, 259 ));
        engBooks.add(new Books(3, "The Picture of Dorian Gray", "Oscar Wilde", 1890, 71));
        engBooks.add(new Books(4, "The Little Prince", "Antoine de Saint-Exupéry", 1943, 109));
        engBooks.add(new Books(5, "Animal Farm", "George Orwell", 1945, 92));

        ukrBooks = new ArrayList<>();
        ukrBooks.add(new Books(1, "Гаррі Поттер і Орден Фенікса", "Дж.К. Роулінг", 2003, 766));
        ukrBooks.add(new Books(2, "Гордість і упередження", "Джейн Остін", 1813, 259));
        ukrBooks.add(new Books(3, "Портрет Доріана Ґрея", "Оскар Вайлд", 1890, 71));
        ukrBooks.add(new Books(4, "Маленький принц", "Антуан де Сент-Екзюпері", 1943, 109));
        ukrBooks.add(new Books(5, "Колгосп тварин", "Джордж Орвелл", 1945, 92));
    }

    @GetMapping
    public ResponseEntity<?> booksList(@RequestParam(value = "lang", defaultValue = "eng") String lang) {
        if (lang.equalsIgnoreCase("ukr")) {
            return ResponseEntity.ok(ukrBooks);
        } else if (lang.equalsIgnoreCase("eng")) {
            return ResponseEntity.ok(engBooks);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Wrong language value");
        }
    }
}
