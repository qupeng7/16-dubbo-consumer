package com.qupeng;

import com.qupeng.model.User;
import com.qupeng.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = context.getBean(UserService.class);

        String hello = userService.sayHello();
        System.out.println(hello);

        User user = userService.getUserById(1);
        System.out.println(user);
    }
}