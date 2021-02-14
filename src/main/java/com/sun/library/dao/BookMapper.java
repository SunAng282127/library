package com.sun.library.dao;

import com.sun.library.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BookMapper {
    int matchBook(String searchWord);

    ArrayList<Book> queryBook(String searchWord);

    ArrayList<Book> getAllBooks();

    int deleteBook(long bookId);

    int addBook(Book book);

    Book getBook(long bookId);

    int editBook(Book book);
}
