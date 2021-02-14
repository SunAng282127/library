package com.sun.library.service;

import com.sun.library.pojo.ReaderCard;
import com.sun.library.pojo.ReaderInfo;

public interface LoginService {
    public boolean hasMatchReader(int readerId, String passwd);

    public ReaderCard findReaderCardByUserId(int readerId);

    public ReaderInfo findReaderInfoByReaderId(int readerId);

    public boolean hasMatchAdmin(int adminId, String password);

    public boolean adminRePasswd(int adminId, String newPasswd);

    public String getAdminPasswd(int id);
}
