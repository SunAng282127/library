package com.sun.library.service;

import com.sun.library.pojo.Lend;

import java.util.ArrayList;

public interface LendService {
    public boolean bookReturn(long bookId);

    public boolean bookLend(long bookId, int readerId);

    public ArrayList<Lend> lendList();

    public ArrayList<Lend> myLendList(int readerId);
}
