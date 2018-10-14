package com.spring;

import org.springframework.beans.factory.FactoryBean;

import java.sql.DriverManager;

/**
 * Created by Administrator on 2018/10/3.
 */
public class DriverFactoryBeanTest implements FactoryBean {

    private String jdbcUrl;;

    @Override
    public Object getObject() throws Exception {
        return DriverManager.getDriver(jdbcUrl);
    }

    @Override
    public Class<?> getObjectType() {
        return java.sql.Driver.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
