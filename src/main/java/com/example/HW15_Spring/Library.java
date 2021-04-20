package com.example.HW15_Spring;

import java.util.HashSet;
import java.util.List;

public class Library {
    public String name;
    public String city;
    public List<Author> authors;
    public List<Book> books;
    Library(){}
    Library(List<Author> authors, List<Book> books){
        this.authors=authors;
        this.books=books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
