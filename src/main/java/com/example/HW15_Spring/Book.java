package com.example.HW15_Spring;

import org.springframework.stereotype.Component;


@Component
public class Book {
    public String name;
    public Author author;
    Book(){}
//    Book(Author author){
//    this.author=author;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
