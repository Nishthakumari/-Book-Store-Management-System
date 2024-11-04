package com.store.bookstore_management.controller;

import com.store.bookstore_management.model.Order;
import com.store.bookstore_management.repository.OrderRepository;
import com.store.bookstore_management.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/{orders}")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders()
    {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order)
    {
        return orderService.addOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id)
    {
        orderService.deleteOrder(id);
    }

}
