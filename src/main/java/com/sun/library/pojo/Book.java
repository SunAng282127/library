package com.sun.library.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Book implements Serializable {
    private long bookId;
    private String name;
    private String author;
    private String publish;
    private String isbn;
    private String introduction;
    private String language;
    private BigDecimal price;
    private Date pubdate;
    private int classId;
    private int pressmark;
    private int state;

    public Book() {
    }

    public Book(long bookId, String name, String author, String publish, String isbn, String introduction, String language, BigDecimal price, Date pubdate, int classId, int pressmark, int state) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.isbn = isbn;
        this.introduction = introduction;
        this.language = language;
        this.price = price;
        this.pubdate = pubdate;
        this.classId = classId;
        this.pressmark = pressmark;
        this.state = state;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getPressmark() {
        return pressmark;
    }

    public void setPressmark(int pressmark) {
        this.pressmark = pressmark;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Book{" +
                "书籍Id=" + bookId +
                ", 书籍名称='" + name + '\'' +
                ", 作者='" + author + '\'' +
                ", 出版社='" + publish + '\'' +
                ", isbn='" + isbn + '\'' +
                ", 介绍='" + introduction + '\'' +
                ", 语言='" + language + '\'' +
                ", 价格=" + price +
                ", 出版日期=" + pubdate +
                ", classId=" + classId +
                ", pressmark=" + pressmark +
                ", 状态=" + state +
                '}';
    }
}
