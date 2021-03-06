package com.spring.hero;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author daiqun
 * @version 2019.04.18
 */
@SpringBootTest(classes = HeroApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDataSource {

    @Resource
    private DataSource dataSource;

    @Test
    public void testConnection() throws Exception {
        System.out.println(this.dataSource);
    }
}
