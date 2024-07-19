package com.example.OneToMany.Demo.Controller;

import com.example.OneToMany.Demo.Entity.Author;
import com.example.OneToMany.Demo.Entity.Books;
import com.example.OneToMany.Demo.Repository.AuthorRepository;
import com.example.OneToMany.Demo.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {

    @Autowired
    AuthorRepository arepo;

    @Autowired
    BooksRepository brepo;

    @GetMapping("/test")
    public String test(){
        return "thsi is a test run";
    }

    @PostMapping("/save")
    public Author save(@RequestBody Author author) {
        // Ensure each book has a reference to the author
        for (Books book : author.getBooks()) {
            book.setAuthor(author);
        }
        return arepo.save(author);
    }

    @GetMapping("/all")
    public List<Author> findAll(){
        return arepo.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Author> findById(@PathVariable int id){
        return arepo.findById(id);
    }

    @DeleteMapping("/del/{id}")
    public String deleteById(@PathVariable int id){
        arepo.deleteById(id);
        return "data Deleted";
    }
}
