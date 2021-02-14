package com.sun.library.dao;

import com.sun.library.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml"})
public class BookMapperTest {
    @Resource
    private BookMapper bookMapper;

    @Test
    public void testMatchBook() {
        int count = bookMapper.matchBook("方向");
        System.out.println(count);
    }

    @Test
    public void testQueryBook() {
        ArrayList<Book> books = bookMapper.queryBook("方向");
        for(Book book:books){
            System.out.println(book);
        }
    }

    @Test
    public void testGetAllBooks() {
        ArrayList<Book> books = bookMapper.getAllBooks();
        for(Book book:books){
            System.out.println(book);
        }
    }

    @Test
    public void testDeleteBook() {
    }

    @Test
    public void testAddBook() {
        Book book = new Book();
        book.setAuthor("尼古拉·果戈理 ");
        book.setClassId(7);
        book.setIntroduction("小说描写专营骗术的商人乞乞科夫来到某偏僻省城，以其天花乱坠的吹捧成为当地官僚的座上客，并上门去向地主收购死农奴，企图以此作为抵押，买空卖空，牟取暴利。丑事败露后，他便逃之夭夭。");
        book.setIsbn("562565165");
        book.setLanguage("中文");
        book.setName("死魂灵");
        book.setPressmark(7);
        book.setPrice(new BigDecimal(122));
        book.setPubdate(new Date(2008, 10, 1));
        book.setPublish("北京燕山出版社");
        book.setState(1);
        int count = bookMapper.addBook(book);
        System.out.println(bookMapper.queryBook("死魂灵"));
    }

    @Test
    public void testGetBook() {
        System.out.println(bookMapper.getBook((long) 10000010));
    }

    @Test
    public void testEditBook() {
        Book book = new Book();
        book.setAuthor("果戈理 ");
        book.setClassId(7);
        book.setIntroduction("小说描写专营骗术的商人乞乞科夫来到某偏僻省城，以其天花乱坠的吹捧成为当地官僚的座上客，并上门去向地主收购死农奴，企图以此作为抵押，买空卖空，牟取暴利。丑事败露后，他便逃之夭夭。");
        book.setIsbn("562565165");
        book.setLanguage("中文");
        book.setName("死魂灵");
        book.setPressmark(7);
        book.setPrice(new BigDecimal(122));
        book.setPubdate(new Date(2008, 10, 1));
        book.setPublish("北京燕山出版社");
        book.setState(1);
        book.getBookId();
        bookMapper.editBook(book);
    }
}