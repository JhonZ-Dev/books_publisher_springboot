package com.example.book_publisher_api.repositorio;

import com.example.book_publisher_api.modelo.Publisher_jaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    public void deletePublisher(Long id) {
        publishers_jaba.removeIf(publisher -> publisher.getId_publisher_jaba().equals(id));
    }
    public Optional<Publisher_jaba> findById(Long id) {
        return publishers_jaba.stream()
                .filter(libro -> libro.getId_publisher_jaba().equals(id))
                .findFirst();
    }
    public List<Publisher_jaba> obtenerPublicacionesSAJorgue() {
        return publishers_jaba.stream()
                .filter(publisher -> publisher.getTitle_jaba() != null &&
                        publisher.getTitle_jaba().startsWith("A") &&
                        publisher.getTitle_jaba().contains("SA"))
                .collect(Collectors.toList());
    }

}
