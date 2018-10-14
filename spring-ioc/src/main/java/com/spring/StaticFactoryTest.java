package com.spring;

/**
 * Created by Administrator on 2018/10/3.
 */
public class StaticFactoryTest {
    private String name;
    private int sex;

    public StaticFactoryTest(){

    }

    public StaticFactoryTest(String name, int sex){
        this.name = name;
        this.sex = sex;
    }

    public static ConstructorTest build(String type) {
        if ("A".equals(type)) {
            return new ConstructorTest("majiji", 2);
        } else if ("B".equals(type)) {
            return new ConstructorTest("lucifer2", 1);
        }else {
            throw new IllegalArgumentException("type must 'A' or 'B'");
        }
    }
}
