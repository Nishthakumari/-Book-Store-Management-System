package com.store.bookstore_management.service;

import com.store.bookstore_management.model.Author;
import com.store.bookstore_management.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }

    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }
}
