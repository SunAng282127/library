package com.sun.library.dao;

import com.sun.library.pojo.ReaderInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml"})
public class ReaderInfoMapperTest {
    @Resource
    private ReaderInfoMapper readerInfoMapper;

    @Test
    public void testGetAllReaderInfo() {
        System.out.println(readerInfoMapper.getAllReaderInfo());
    }

    @Test
    public void testFindReaderInfoByReaderId() {
        System.out.println(readerInfoMapper.findReaderInfoByReaderId(20160803));
    }

    @Test
    public void testDeleteReaderInfo() {
        System.out.println(readerInfoMapper.deleteReaderInfo(20160803));
    }

    @Test
    public void testEditReaderInfo() {
        ReaderInfo readerInfo = new ReaderInfo();
        readerInfo.setReaderId(20160803);
        readerInfo.setName("孙思慧");
        readerInfo.setAddress("枣庄市");
        readerInfo.setBirth(new Date(96, 11, 13));
        readerInfo.setSex("男");
        readerInfo.setTelcode("12345678912");
        readerInfoMapper.editReaderInfo(readerInfo);
    }

    @Test
    public void testAddReaderInfo() {
        ReaderInfo readerInfo = new ReaderInfo();
        readerInfo.setReaderId(20160810);
        readerInfo.setName("孙思慧");
        readerInfo.setAddress("枣庄市");
        readerInfo.setBirth(new Date(97, 01, 26));
        readerInfo.setSex("男");
        readerInfo.setTelcode("12345678911");
        readerInfoMapper.addReaderInfo(readerInfo);
    }
}
