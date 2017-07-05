package com.greekw.test.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by greekw on 2017/7/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
public class UserEntityTest{
    private static final Logger logger = LogManager.getLogger(UserEntityTest.class);


    @Autowired
    private UserEntity userEntity;

    @Test
    public void randomTestUser() {
        logger.info("\n userEntity:{}",userEntity.toString());
    }

}
