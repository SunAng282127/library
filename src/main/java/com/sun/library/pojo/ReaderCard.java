package com.sun.library.pojo;

import java.io.Serializable;

public class ReaderCard implements Serializable {
    private int readerId;
    private String name;
    private String passwd;
    private int cardState;

    public ReaderCard() {
    }

    public ReaderCard(int readerId, String name, String passwd, int cardState) {
        this.readerId = readerId;
        this.name = name;
        this.passwd = passwd;
        this.cardState = cardState;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getCardState() {
        return cardState;
    }

    public void setCardState(int cardState) {
        this.cardState = cardState;
    }

    @Override
    public String toString() {
        return "ReaderCard{" +
                "readerId=" + readerId +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", cardState=" + cardState +
                '}';
    }
}
