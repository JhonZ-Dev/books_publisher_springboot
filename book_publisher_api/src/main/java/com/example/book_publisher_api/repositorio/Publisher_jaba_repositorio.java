package com.example.book_publisher_api.repositorio;

import com.example.book_publisher_api.modelo.Publisher_jaba;

import java.util.ArrayList;
import java.util.List;

public class Publisher_jaba_repositorio {

    private List<Publisher_jaba> publishers_jaba = new ArrayList<>();
    public void addPublisher(Publisher_jaba publisher) {
        publishers_jaba.add(publisher);
    }

}
