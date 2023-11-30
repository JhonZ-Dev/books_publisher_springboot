package com.example.book_publisher_api.modelo;

import java.util.List;

public class Book_jaba {

    private Long id_jaba;
    private String name_jaba;

    private List<Publisher_jaba> publishers_jaba;
    public Long getId_jaba() {
        return id_jaba;
    }

    public void setId_jaba(Long id_jaba) {
        this.id_jaba = id_jaba;
    }

    public String getName_jaba() {
        return name_jaba;
    }

    public void setName_jaba(String name_jaba) {
        this.name_jaba = name_jaba;
    }

    public List<Publisher_jaba> getPublishers_jaba() {
        return publishers_jaba;
    }

    public void setPublishers_jaba(List<Publisher_jaba> publishers_jaba) {
        this.publishers_jaba = publishers_jaba;
    }

    public Book_jaba(Long id_jaba, String name_jaba, List<Publisher_jaba> publishers_jaba) {
        this.id_jaba = id_jaba;
        this.name_jaba = name_jaba;
        this.publishers_jaba = publishers_jaba;
    }
}
