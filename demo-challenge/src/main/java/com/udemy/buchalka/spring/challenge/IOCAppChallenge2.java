package com.udemy.buchalka.spring.challenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge2 {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("demo-challenge/beans-challenge2.xml");
        City cityAdelaide = (City) ctx.getBean("cityAdelaide");
        cityAdelaide.sityName();

        ((FileSystemXmlApplicationContext) ctx).close();
    }
}
