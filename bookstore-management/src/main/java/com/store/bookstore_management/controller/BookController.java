package com.store.bookstore_management.controller;

import com.store.bookstore_management.model.Book;
import com.store.bookstore_management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book)
    {
        return bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id)
    {
        bookService.deleteBook(id);
    }

}
