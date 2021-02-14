package com.sun.library.service.impl;

import com.sun.library.dao.LendMapper;
import com.sun.library.pojo.Lend;
import com.sun.library.service.LendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class LendServiceImpl implements LendService {
    @Autowired
    private LendMapper lendMapper;

    @Override
    public boolean bookReturn(long bookId) {
        return lendMapper.bookReturnOne(bookId, new Date()) > 0 && lendMapper.bookReturnTwo(bookId) > 0;
    }

    @Override
    public boolean bookLend(long bookId, int readerId) {
        return lendMapper.bookLendOne(bookId, readerId, new Date()) > 0 && lendMapper.bookLendTwo(bookId) > 0;
    }

    @Override
    public ArrayList<Lend> lendList() {
        return lendMapper.lendList();
    }

    @Override
    public ArrayList<Lend> myLendList(int readerId) {
        return lendMapper.myLendList(readerId);
    }
}
