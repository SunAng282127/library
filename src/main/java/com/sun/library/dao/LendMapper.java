package com.sun.library.dao;

import com.sun.library.pojo.Lend;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;

@Repository
public interface LendMapper {
    int bookReturnOne(@Param("bookId") long bookId, @Param("backDate") Date backDate);

    int bookReturnTwo(long bookId);

    int bookLendOne(@Param("bookId") long bookId,@Param("readerId") int readerId,@Param("lendDate")Date lendDate);

    int bookLendTwo(long bookId);

    ArrayList<Lend> lendList();

    ArrayList<Lend> myLendList(int readerId);
}
