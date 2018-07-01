package com.udemy.buchalka.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConstructor {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-constructor.xml");

        Organization organization = (Organization) ctx.getBean("organization");
        organization.slogan();

        System.out.println(organization.toString());

        ((ClassPathXmlApplicationContext) ctx).close();

    }
}
