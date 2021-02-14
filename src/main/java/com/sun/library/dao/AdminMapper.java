package com.sun.library.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    int getMatchCount(@Param("adminId") int adminId, @Param("password") String password);

    int rePassword(@Param("adminId") int adminId, @Param("password") String password);

    String getPasswd(int id);
}
