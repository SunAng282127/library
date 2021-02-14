package com.sun.library.service;

import com.sun.library.pojo.ReaderInfo;

public interface ReaderCardService {
    public boolean addReaderCard(ReaderInfo readerInfo);

    public boolean updatePasswd(int readerId, String passwd);

    public boolean updateName(int readerId, String name);
}
