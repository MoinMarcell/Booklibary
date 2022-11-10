package com.example.booklibary.repo;

import com.example.booklibary.model.Book;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookRepoTest {

    BookRepo bookRepo = mock(BookRepo.class);

    @Test
    void getBooks_whenListOfBooksIsNotEmptyReturnAllBooks() {
        // GIVEN
        List<Book> expectedBookList = new ArrayList<>();
        // WHEN
        when(bookRepo.getBooks()).thenReturn(expectedBookList);
        List<Book> actual = bookRepo.getBooks();
        // THEN
        assertEquals(expectedBookList, actual);
        verify(bookRepo).getBooks();
    }

    @Test
    void addBook() {
        // GIVEN
        Book expected = new Book("123", "", "");
        // WHEN
        when(bookRepo.addBook(expected)).thenReturn(expected);
        Book result = bookRepo.addBook(expected);
        // THEN
        assertEquals(expected, result);
        verify(bookRepo).addBook(expected);
    }

    @Test
    void getBookByIsbn() {
        // GIVEN
        Book expected = new Book("1", "", "");
        String isbn = "1";
        // WHEN
        when(bookRepo.getBookByIsbn(isbn)).thenReturn(expected);
        Book result = bookRepo.getBookByIsbn(isbn);
        // THEN
        assertEquals(expected, result);
        verify(bookRepo).getBookByIsbn(isbn);
    }

    @Test
    void getBookByTitle() {
        // GIVEN
        Book expected = new Book("123", "Bananenkönig", "Helmut Graupe");
        String title = "Bananenkönig";
        // WHEN
        when(bookRepo.getBookByTitle(title)).thenReturn(expected);
        Book actual = bookRepo.getBookByTitle(title);
        // THEN
        assertEquals(expected, actual);
        verify(bookRepo).getBookByTitle(title);
    }

    @Test
    void getBooksByAuthor() {
        // GIVEN
        String author = "";
        List<Book> expected = new ArrayList<>();
        // WHEN
        when(bookRepo.getBooksByAuthor(author)).thenReturn(expected);
        List<Book> actual = bookRepo.getBooksByAuthor(author);
        // THEN
        assertEquals(expected, actual);
        verify(bookRepo).getBooksByAuthor(author);
    }
}