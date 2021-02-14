package com.sun.library.service.impl;

import com.sun.library.dao.ReaderCardMapper;
import com.sun.library.pojo.ReaderInfo;
import com.sun.library.service.ReaderCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderCardServiceImpl implements ReaderCardService {

    @Autowired
    private ReaderCardMapper readerCardMapper;

    @Override
    public boolean addReaderCard(ReaderInfo readerInfo) {
        return readerCardMapper.addReaderCard(readerInfo) > 0;
    }

    @Override
    public boolean updatePasswd(int readerId, String passwd) {
        return readerCardMapper.rePassword(readerId, passwd) > 0;
    }

    @Override
    public boolean updateName(int readerId, String name) {
        return readerCardMapper.updateName(readerId, name) > 0;
    }
}
