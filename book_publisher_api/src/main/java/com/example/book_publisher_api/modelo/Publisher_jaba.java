package com.example.book_publisher_api.modelo;

public class Publisher_jaba {
    private Long id_publisher_jaba;
    private String isbn_jaba;
    private String title_jaba;
    private Integer total_pages_jaba;
    private String year_jaba;

    private Book_jaba book;
    public Long getId_publisher_jaba() {
        return id_publisher_jaba;
    }

    public void setId_publisher_jaba(Long id_publisher_jaba) {
        this.id_publisher_jaba = id_publisher_jaba;
    }

    public String getIsbn_jaba() {
        return isbn_jaba;
    }

    public void setIsbn_jaba(String isbn_jaba) {
        this.isbn_jaba = isbn_jaba;
    }

    public String getTitle_jaba() {
        return title_jaba;
    }

    public void setTitle_jaba(String title_jaba) {
        this.title_jaba = title_jaba;
    }

    public Integer getTotal_pages_jaba() {
        return total_pages_jaba;
    }

    public void setTotal_pages_jaba(Integer total_pages_jaba) {
        this.total_pages_jaba = total_pages_jaba;
    }

    public String getYear_jaba() {
        return year_jaba;
    }

    public void setYear_jaba(String year_jaba) {
        this.year_jaba = year_jaba;
    }

    public Book_jaba getBook() {
        return book;
    }

    public void setBook(Book_jaba book) {
        this.book = book;
    }
}
