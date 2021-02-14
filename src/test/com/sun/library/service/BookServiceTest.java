package com.sun.library.service;

import com.sun.library.pojo.Book;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml", "classpath:spring/applicationContext-service.xml"})
public class BookServiceTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    @Test
    public void queryBook() {
        ArrayList<Book> books = bookService.queryBook("方向");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void getAllBooks() {
        ArrayList<Book> books = bookService.getAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void deleteBook(){
        int count=bookService.deleteBook(1255);
    }

    @Test
    public void matchBook(){
        boolean flag=bookService.matchBook("方向");
        System.out.println(flag);
    }
}
