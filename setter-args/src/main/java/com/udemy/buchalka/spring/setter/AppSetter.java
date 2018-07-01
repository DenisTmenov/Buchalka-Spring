package com.udemy.buchalka.spring.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSetter {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-setter.xml");

        Organization organization = (Organization) ctx.getBean("organization");
        organization.slogan();

        System.out.println(organization.toString());

        ((ClassPathXmlApplicationContext) ctx).close();

    }
}
