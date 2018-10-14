package com.spring;

/**
 * Created by Administrator on 2018/10/3.
 */
public class ConstructorTest {
    private String name;
    private int sex;
    private ByNameTest bnt;

    public ConstructorTest() {
    }

    public ConstructorTest(String name, int sex, ByNameTest bnt) {
        this.name = name;
        this.sex = sex;
        this.bnt = bnt;
    }

    public ConstructorTest(String name, int sex){
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
