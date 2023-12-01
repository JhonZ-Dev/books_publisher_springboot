package com.example.book_publisher_api.servicio;

import com.example.book_publisher_api.modelo.Book_jaba;
import com.example.book_publisher_api.repositorio.Book_jaba_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Book_jaba_servicio {
    @Autowired
    private Book_jaba_repositorio repositorio_jaba;

    public void addBook(Book_jaba book) {
        repositorio_jaba.addBook(book);
    }

    public List<Book_jaba> getAllBooks() {
        return repositorio_jaba.getAllBooks();
    }
    public Book_jaba getBookById(Long id) {
        return repositorio_jaba.getBookById(id);
    }


}
