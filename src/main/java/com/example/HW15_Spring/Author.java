package com.example.HW15_Spring;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
@Component
public class Author {
    public String name;
    public List<Book> books;
    Author(){}
//    Author(List<Book>books){
//        this.books=books;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List books) {
    }
}
