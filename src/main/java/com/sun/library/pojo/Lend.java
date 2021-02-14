package com.sun.library.pojo;

import java.io.Serializable;
import java.util.Date;

public class Lend implements Serializable {
    private long sernum;
    private long bookId;
    private int readerId;
    private Date lendDate;
    private Date backDate;

    public Lend() {
    }

    public Lend(long sernum, long bookId, int readerId, Date lendDate, Date backDate) {
        this.sernum = sernum;
        this.bookId = bookId;
        this.readerId = readerId;
        this.lendDate = lendDate;
        this.backDate = backDate;
    }

    public long getSernum() {
        return sernum;
    }

    public void setSernum(long sernum) {
        this.sernum = sernum;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public Date getLendDate() {
        return lendDate;
    }

    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    public Date getBackDate() {
        return backDate;
    }

    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }

    @Override
    public String toString() {
        return "Lend{" +
                "sernum=" + sernum +
                ", bookId=" + bookId +
                ", readerId=" + readerId +
                ", lendDate=" + lendDate +
                ", backDate=" + backDate +
                '}';
    }
}
