package com.sun.library.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml"})
public class LendMapperTest {
    @Resource
    private LendMapper lendMapper;

    @Test
    public void testBookReturnOne() {
        lendMapper.bookReturnOne(50000004, new Date());
    }

    @Test
    public void testBookReturnTwo() {
        lendMapper.bookReturnTwo(50000004);
    }

    @Test
    public void testBookLendOne() {
        lendMapper.bookLendOne(50000004, 20160803, new Date());
    }

    @Test
    public void testBookLendTwo() {
        lendMapper.bookLendTwo(50000004);
    }

    @Test
    public void testLendList() {
        System.out.println(lendMapper.lendList());
    }

    @Test
    public void testMyLendList() {
        System.out.println(lendMapper.myLendList(1501014101));
    }
}
