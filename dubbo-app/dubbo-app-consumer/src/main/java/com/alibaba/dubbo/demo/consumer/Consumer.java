package com.alibaba.dubbo.demo.consumer;


import com.huc.app.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ken.lj on 2017/7/31.
 */
public class Consumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");

        UserService userService = (UserService)context.getBean("userService");
        System.out.println(userService.getList()); // 显示调用结果


    }
}
