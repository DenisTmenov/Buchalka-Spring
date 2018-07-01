package com.udemy.buchalka.spring.challenge;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge2 {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans-challenge.xml");
        City cityAdelaide = (City) ctx.getBean("cityAdelaide");
        cityAdelaide.sityName();
    }
}
