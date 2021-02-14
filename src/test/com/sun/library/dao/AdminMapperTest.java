package com.sun.library.dao;

import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml"})
public class AdminMapperTest {
    @Resource
    private AdminMapper adminMapper;

    @Test
    public void getMatchCount() {
        int count = adminMapper.getMatchCount(20160001, "111111");
        System.out.println(count);
    }


    @Test
    public void rePassword() {
        int count = adminMapper.rePassword(20160001, "555555");
        System.out.println(count);
    }

    @Test
    public void getPasswd() {
        String passwd = adminMapper.getPasswd(20160001);
        System.out.println(passwd);
    }
}
