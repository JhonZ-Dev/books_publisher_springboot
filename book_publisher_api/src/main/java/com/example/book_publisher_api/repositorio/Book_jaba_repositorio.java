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

    public List<Book_jaba> getAllBooks() {
        return books_jaba;
    }

    public Book_jaba getBookById(Long id) {
        for (Book_jaba book : books_jaba) {
            if (book.getId_jaba().equals(id)) {
                return book;
            }
        }
        return null; // Si no se encuentra el libro con el ID dado
    }
    public void updateBook(Book_jaba updatedBook) {
        for (int i = 0; i < books_jaba.size(); i++) {
            Book_jaba book = books_jaba.get(i);
            if (book.getId_jaba().equals(updatedBook.getId_jaba())) {
                books_jaba.set(i, updatedBook);
                return;
            }
        }
        // Si no se encuentra el libro con el ID dado, puedes manejarlo según tus necesidades
    }
}
