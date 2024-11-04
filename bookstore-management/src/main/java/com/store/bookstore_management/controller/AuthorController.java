package com.store.bookstore_management.controller;

import com.store.bookstore_management.model.Author;
import com.store.bookstore_management.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> GetAllAuthors()
    {
        return authorService.getAllAuthors();
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author author)
    {
        return authorService.addAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id)
    {
        authorService.deleteAuthor(id);
    }
}
