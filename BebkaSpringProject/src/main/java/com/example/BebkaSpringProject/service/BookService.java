package com.example.BebkaSpringProject.service;

import com.example.BebkaSpringProject.model.Book;
import com.example.BebkaSpringProject.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book)
    {
        return bookRepository.save(book);
    }
}
