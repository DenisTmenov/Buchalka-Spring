package com.udemy.buchalka.spring.challenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
        City cityAdelaide = (City) ctx.getBean("cityAdelaide");
        cityAdelaide.sityName();

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
