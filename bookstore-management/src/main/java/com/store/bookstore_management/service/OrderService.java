package com.store.bookstore_management.service;

import com.store.bookstore_management.model.Order;
import com.store.bookstore_management.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders()
    {
        return orderRepository.findAll();
    }

    public Order addOrder(Order order)
    {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id)
    {
        orderRepository.deleteById(id);
    }
}
