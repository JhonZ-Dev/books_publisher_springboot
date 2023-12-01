package com.example.book_publisher_api.repositorio;

import com.example.book_publisher_api.modelo.Publisher_jaba;

import java.util.ArrayList;
import java.util.List;

public class Publisher_jaba_repositorio {

    private List<Publisher_jaba> publishers_jaba = new ArrayList<>();
    public void addPublisher(Publisher_jaba publisher) {
        publishers_jaba.add(publisher);
    }
    public List<Publisher_jaba> getAllPublishers() {
        return publishers_jaba;
    }
    public Publisher_jaba getPublisherById(Long id) {
        for (Publisher_jaba publisher : publishers_jaba) {
            if (publisher.getId_publisher_jaba().equals(id)) {
                return publisher;
            }
        }
        return null; // Si no se encuentra la publicación con el ID dado
    }
    public void updatePublisher(Publisher_jaba updatedPublisher) {
        for (int i = 0; i < publishers_jaba.size(); i++) {
            Publisher_jaba publisher = publishers_jaba.get(i);
            if (publisher.getId_publisher_jaba().equals(updatedPublisher.getId_publisher_jaba())) {
                publishers_jaba.set(i, updatedPublisher);
                return;
            }
        }
        // Si no se encuentra la publicación con el ID dado, puedes manejarlo según tus necesidades
    }

}
