package com.sun.library.service;

import com.sun.library.pojo.ReaderInfo;

import java.util.ArrayList;

public interface ReaderInfoService {
    public ArrayList<ReaderInfo> readerInfos();

    public boolean deleteReaderInfo(int readerId);

    public ReaderInfo getReaderInfo(int readerId);

    public boolean editReaderInfo(ReaderInfo readerInfo);

    public boolean addReaderInfo(ReaderInfo readerInfo);
}
