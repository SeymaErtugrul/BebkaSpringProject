package com.example.BebkaSpringProject.repository;

import com.example.BebkaSpringProject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bookRepo")
public interface BookRepository extends JpaRepository<Book,Long> {

}

