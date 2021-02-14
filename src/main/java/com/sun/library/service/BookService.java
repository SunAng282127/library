package com.sun.library.service;

import com.sun.library.dao.BookMapper;
import com.sun.library.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface BookService {
    public ArrayList<Book> queryBook(String searchWord);

    public ArrayList<Book> getAllBooks();

    public int deleteBook(long bookId);

    public boolean matchBook(String searchWord);

    public boolean addBook(Book book);

    public Book getBook(Long bookId);

    public boolean editBook(Book book);

}
