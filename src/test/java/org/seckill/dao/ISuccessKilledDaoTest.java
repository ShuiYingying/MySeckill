package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.domain.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ISuccessKilledDaoTest {
    @Autowired
    ISuccessKilledDao successKilled;

    @Test
    public void testInsertSuccessKilled(){
        //seckill_id和user_phone为联合主键，insert ignore使得其不报主键冲突的错，所以一个用户只能拍一次
        long id=1001L;
        long phone=123456787L;
        int insertCount = successKilled.insertSuccessKilled(id, phone);
        System.out.println(insertCount);
    }

    @Test
    public void testQueryById(){
        long id=1001L;
        long phone=123456787L;
        SuccessKilled res= successKilled.queryById(id,phone);
        System.out.println(res);
        System.out.println(res.getSeckill());
    }
}
