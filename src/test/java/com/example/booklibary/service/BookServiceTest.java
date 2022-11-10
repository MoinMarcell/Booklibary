package com.example.booklibary.service;

import com.example.booklibary.model.Book;
import com.example.booklibary.repo.BookRepo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    BookRepo bookRepo = mock(BookRepo.class);

    BookService bookService = new BookService(bookRepo);

    @Test
    void getBooks() {

        // GIVEN
        List<Book> expected = new ArrayList<>();

        // WHEN
        when(bookRepo.getBooks()).thenReturn(expected);
        List<Book> result = bookService.getBooks();

        // THEN
        assertEquals(expected, result);
        verify(bookRepo).getBooks();

    }

    @Test
    void addBook() {

        // GIVEN
        Book expected = new Book(" ", " ");

        // WHEN
        when(bookRepo.addBook(expected)).thenReturn(expected);
        Book actual = bookService.addBook(expected);

        // THEN
        assertEquals(expected, actual);
        verify(bookRepo).addBook(expected);

    }

    @Test
    void getBookByIsbn() {

        // GIVEN
        Book expected = new Book(" ", " ");
        String isbn = "123";

        //WHEN
        when(bookRepo.getBookByIsbn(isbn)).thenReturn(expected);
        Book actual = bookService.getBookByIsbn(isbn);

        //THEN
        assertEquals(expected, actual);
        verify(bookRepo).getBookByIsbn(isbn);

    }

    @Test
    void getBookByTitle() {
        // GIVEN
        Book expected = new Book("title", "author");
        String title = "";

        //WHEN
        when(bookRepo.getBookByTitle(title)).thenReturn(expected);
        Book actual = bookService.getBookByTitle(title);

        //THEN
        assertEquals(expected, actual);
        verify(bookRepo).getBookByTitle(title);
    }

    @Test
    void getBooksByAuthor() {
        // GIVEN
        List<Book> expected = new ArrayList<>();
        String author = "";

        //WHEN
        when(bookRepo.getBooksByAuthor(author)).thenReturn(expected);
        List<Book> actual = bookService.getBooksByAuthor(author);

        //THEN
        assertEquals(expected, actual);
        verify(bookRepo).getBooksByAuthor(author);
    }
}