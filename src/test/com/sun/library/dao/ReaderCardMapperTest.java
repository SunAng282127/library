package com.sun.library.dao;

import com.sun.library.pojo.ReaderInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml"})
public class ReaderCardMapperTest {
    @Resource
    private ReaderCardMapper readerCardMapper;
    @Test
    public void testGetMatchCount() {
        int count = readerCardMapper.getMatchCount(20160803,"222222");
        System.out.println(count);
    }

    @Test
    public void testFindReaderByReaderId() {
        System.out.println(readerCardMapper.findReaderByReaderId(20160803));
    }

    @Test
    public void testRePassword() {
        readerCardMapper.rePassword(20160803,"111111");
    }

    @Test
    public void testAddReaderCard() {
        ReaderInfo readerInfo = new ReaderInfo();
        readerInfo.setReaderId(20166666);
        readerInfo.setName("李传浩");
        readerCardMapper.addReaderCard(readerInfo);
    }

    @Test
    public void testUpdateName() {
        readerCardMapper.updateName(20160803,"张腾辉");
    }
}
