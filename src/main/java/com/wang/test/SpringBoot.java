package com.wang.test;

import com.wang.test.dao.UserDao;
import com.wang.test.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBoot {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-base.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        User user = new User();
        user.setUserName("wangdasha");
        user.setPassWord("123455");
        userDao.insert(user);
        System.out.println(userDao);
    }
}
