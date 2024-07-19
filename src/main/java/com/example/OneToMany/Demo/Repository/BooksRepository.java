package com.example.OneToMany.Demo.Repository;

import com.example.OneToMany.Demo.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books,Integer> {
}
