package com.sun.library.service.impl;

import com.sun.library.dao.AdminMapper;
import com.sun.library.dao.ReaderCardMapper;
import com.sun.library.dao.ReaderInfoMapper;
import com.sun.library.pojo.ReaderCard;
import com.sun.library.pojo.ReaderInfo;
import com.sun.library.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private ReaderCardMapper readerCardMapper;
    @Autowired
    private ReaderInfoMapper readerInfoMapper;
    @Autowired
    private AdminMapper adminMapper;


    @Override
    public boolean hasMatchReader(int readerId, String passwd) {
        return readerCardMapper.getMatchCount(readerId, passwd) > 0;
    }

    @Override
    public ReaderCard findReaderCardByUserId(int readerId) {
        return readerCardMapper.findReaderByReaderId(readerId);
    }

    @Override
    public ReaderInfo findReaderInfoByReaderId(int readerId) {
        return readerInfoMapper.findReaderInfoByReaderId(readerId);
    }

    @Override
    public boolean hasMatchAdmin(int adminId, String password) {
        return adminMapper.getMatchCount(adminId, password) == 1;
    }

    @Override
    public boolean adminRePasswd(int adminId, String newPasswd) {
        return adminMapper.rePassword(adminId, newPasswd) > 0;
    }

    @Override
    public String getAdminPasswd(int id) {
        return adminMapper.getPasswd(id);
    }
}
