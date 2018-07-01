package com.udemy.buchalka.spring.challenge;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
        City cityAdelaide = (City) ctx.getBean("cityAdelaide");
        cityAdelaide.sityName();
    }
}
