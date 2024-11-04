package com.store.bookstore_management.service;

import com.store.bookstore_management.model.Book;
import com.store.bookstore_management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book addBook(Book book)
    {
        System.out.println("Received Book: " + book);
        Book b =  bookRepository.save(book);
        System.out.println("Received Book: " + b);
        return b;

    }

    public void deleteBook(Long id)
    {
        bookRepository.deleteById(id);
    }
}
