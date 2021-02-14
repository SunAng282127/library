package com.sun.library.service.impl;

import com.sun.library.dao.ReaderInfoMapper;
import com.sun.library.pojo.ReaderInfo;
import com.sun.library.service.ReaderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReaderInfoServiceImpl implements ReaderInfoService {
    @Autowired
    private ReaderInfoMapper readerInfoMapper;

    @Override
    public ArrayList<ReaderInfo> readerInfos() {
        return readerInfoMapper.getAllReaderInfo();
    }

    @Override
    public boolean deleteReaderInfo(int readerId) {
        return readerInfoMapper.deleteReaderInfo(readerId) > 0;
    }

    @Override
    public ReaderInfo getReaderInfo(int readerId) {
        return readerInfoMapper.findReaderInfoByReaderId(readerId);
    }

    @Override
    public boolean editReaderInfo(ReaderInfo readerInfo) {
        return readerInfoMapper.editReaderInfo(readerInfo) > 0;
    }

    @Override
    public boolean addReaderInfo(ReaderInfo readerInfo) {
        return readerInfoMapper.addReaderInfo(readerInfo) > 0;
    }
}
