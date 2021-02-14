package com.sun.library.dao;

import com.sun.library.pojo.ReaderInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ReaderInfoMapper {
    ArrayList<ReaderInfo> getAllReaderInfo();

    ReaderInfo findReaderInfoByReaderId(int readerId);

    int deleteReaderInfo(int readerId);

    int editReaderInfo(ReaderInfo readerInfo);

    int addReaderInfo(ReaderInfo readerInfo);

}
