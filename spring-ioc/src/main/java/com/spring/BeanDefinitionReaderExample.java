package com.spring;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/10/3.
 */
public class BeanDefinitionReaderExample {
    public static void main(String[] args){
        //注册中心
        BeanDefinitionRegistry register = new SimpleBeanDefinitionRegistry();
        //读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(register);
        //资源加载器
        DefaultResourceLoader loader = new DefaultResourceLoader();
        //将配置文件加载到加载器中
        Resource resource = loader.getResource("spring.xml");
        //使用读取器来加载配置文件
        reader.loadBeanDefinitions(resource);
        System.out.println(Arrays.toString(register.getBeanDefinitionNames()));
    }
}
