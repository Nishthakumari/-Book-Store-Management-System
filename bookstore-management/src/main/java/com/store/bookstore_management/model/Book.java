package com.store.bookstore_management.model;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;
    private double price;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
