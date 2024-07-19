package com.example.OneToMany.Demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String bookName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    @JsonIgnoreProperties("books")
    Author author;


    public Books(int id, String bookName, Author author) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
