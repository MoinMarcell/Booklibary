package com.example.booklibary.service;

import com.example.booklibary.model.Book;
import com.example.booklibary.repo.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getBooks(){
        return bookRepo.getBooks();
    }

    public Book addBook(Book book){
        return bookRepo.addBook(book);
    }

    public Book getBookByIsbn(int isbn){
        return bookRepo.getBookByIsbn(isbn);
    }

    public Book getBookByTitle(String title){
        return bookRepo.getBookByTitle(title);
    }

    public List<Book> getBooksByAuthor(String author){
        return bookRepo.getBooksByAuthor(author);
    }
}
