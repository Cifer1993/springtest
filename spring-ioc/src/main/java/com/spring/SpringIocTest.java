package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by Administrator on 2018/10/3.
 */
public class SpringIocTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        context.getBean("ConstructorTest").getClass();
    }
}
