package com.example.BebkaSpringProject.controller;

import com.example.BebkaSpringProject.model.Book;
import com.example.BebkaSpringProject.repository.BookRepository;
import com.example.BebkaSpringProject.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

   public BookController(BookService bookService)
   {
       this.bookService=bookService;
   }
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
}
