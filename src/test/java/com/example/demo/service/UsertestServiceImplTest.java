package com.example.demo.service;

import com.example.demo.service.impl.UsertestServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/*
  注意：注解SpringBootTest会启动整个springboot项目
  我们也可以只使用@RunWith 注解进行单元测试，实测不好用！！
 */

@SpringBootTest
//@RunWith(SpringRunner.class)
public class UsertestServiceImplTest {

//    @TestConfiguration
//    static class prepareUsertestServiceImpl{
//        @Bean
//        public UsertestServiceImpl getUsertestServiceImpl(){
//            return  new UsertestServiceImpl();
//        }
//    }

    @Autowired
    private UsertestServiceImpl usertestServiceImpl;

    @Test
    void checkUsertest() {
        System.out.println(usertestServiceImpl.checkUsertest("张三","333"));
    }

    @Test
    void checkUsername() {
        System.out.println(usertestServiceImpl.checkUsername("张三"));
    }
}