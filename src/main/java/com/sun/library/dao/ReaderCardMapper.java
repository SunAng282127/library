package com.sun.library.dao;

import com.sun.library.pojo.ReaderCard;
import com.sun.library.pojo.ReaderInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderCardMapper {
    int getMatchCount(@Param("readerId") int readerId, @Param("passwd") String passwd);

    ReaderCard findReaderByReaderId(int userId);

    int rePassword(@Param("readerId") int readerId, @Param("passwd") String newPasswd);

    int addReaderCard(ReaderInfo readerInfo);

    int updateName(@Param("readerId") int readerId, @Param("name") String name);

}
