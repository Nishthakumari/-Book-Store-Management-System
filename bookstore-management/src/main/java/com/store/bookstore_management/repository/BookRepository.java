package com.store.bookstore_management.repository;

import com.store.bookstore_management.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
