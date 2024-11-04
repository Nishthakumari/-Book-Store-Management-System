package com.store.bookstore_management.repository;

import com.store.bookstore_management.model.Book;
import com.store.bookstore_management.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
