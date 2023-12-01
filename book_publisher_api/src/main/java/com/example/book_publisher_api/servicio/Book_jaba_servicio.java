package com.example.book_publisher_api.servicio;

import com.example.book_publisher_api.repositorio.Book_jaba_repositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class Book_jaba_servicio {
    @Autowired
    private Book_jaba_repositorio repositorio_jaba;
}
