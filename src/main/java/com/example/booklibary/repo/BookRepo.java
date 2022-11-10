package com.example.booklibary.repo;

import com.example.booklibary.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepo {
    private final List<Book> books;



    public BookRepo(List<Book> books) {
        this.books = books;
    }

    public BookRepo() {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book addBook(Book book){
        for(Book b : books){
            if(b.equals(book)){
                return new Book("0", "Fehler!", "Buch bereits vorhanden!");
            }
        }
        books.add(book);
        return book;
    }

    public Book getBookByIsbn(String isbn){
        for(Book b : books){
            if(b.isbn().equals(isbn)){
                return b;
            }
        }
        return null;
    }

    public Book getBookByTitle(String title){
        for(Book b : books){
            if(b.title().equals(title)){
                return b;
            }
        }
        return null;
    }

    public List<Book> getBooksByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();
        for(Book b : books){
            if(b.author().equals(author)){
                booksByAuthor.add(b);
            }
        }
        return booksByAuthor;
    }
}
