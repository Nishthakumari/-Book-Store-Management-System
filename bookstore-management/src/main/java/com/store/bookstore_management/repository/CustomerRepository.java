package com.store.bookstore_management.repository;

import com.store.bookstore_management.model.Book;
import com.store.bookstore_management.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
