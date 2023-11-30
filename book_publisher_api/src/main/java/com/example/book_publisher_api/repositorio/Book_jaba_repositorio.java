package com.example.book_publisher_api.repositorio;

import com.example.book_publisher_api.modelo.Book_jaba;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Book_jaba_repositorio {
    private List<Book_jaba> books_jaba = new ArrayList<>();

    public void addBook(Book_jaba book) {
        books_jaba.add(book);
    }
}
