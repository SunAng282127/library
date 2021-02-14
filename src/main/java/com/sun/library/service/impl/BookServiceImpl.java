package com.sun.library.service.impl;

import com.sun.library.dao.BookMapper;
import com.sun.library.pojo.Book;
import com.sun.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public ArrayList<Book> queryBook(String searchWord) {
        return bookMapper.queryBook(searchWord);
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public int deleteBook(long bookId) {
        return bookMapper.deleteBook(bookId);
    }

    @Override
    public boolean matchBook(String searchWord) {
        return bookMapper.matchBook(searchWord) > 0;
    }

    @Override
    public boolean addBook(Book book) {
        return bookMapper.addBook(book) > 0;
    }

    @Override
    public Book getBook(Long bookId) {
        return bookMapper.getBook(bookId);
    }

    @Override
    public boolean editBook(Book book) {
        return bookMapper.editBook(book) > 0;
    }
}
