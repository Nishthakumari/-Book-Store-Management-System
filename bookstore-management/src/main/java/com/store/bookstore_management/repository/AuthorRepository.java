package com.store.bookstore_management.repository;

import com.store.bookstore_management.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
