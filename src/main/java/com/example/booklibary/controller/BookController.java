package com.example.booklibary.controller;

import com.example.booklibary.model.Book;
import com.example.booklibary.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    List<Book> getAllBooks(){
        return bookService.getBooks();
    }

    @PostMapping("/books/add-book")
    Book addBook(@RequestBody Book bookToAdd){
        return bookService.addBook(bookToAdd);
    }

    @GetMapping("/books/{isbn}")
    Book getBookByIsbn(@PathVariable String isbn){
        return bookService.getBookByIsbn(isbn);
    }

    @GetMapping(path="/books/{title}")
    Book getBookByTitle(@PathVariable String title){
        return bookService.getBookByTitle(title);
    }

    @GetMapping(path="/books/all-books-by-author")
    List<Book> getBooksByAuthor(@RequestBody String author){
        return bookService.getBooksByAuthor(author);
    }
}
