package com.udemy.buchalka.spring.setter;

import com.udemy.buchalka.spring.domain.HumanResourceDept;
import com.udemy.buchalka.spring.domain.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDiSetter {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-di-setter.xml");

        Organization organization = (Organization) ctx.getBean("organization");

        System.out.println(organization.getSlogan());
        System.out.println(organization.corporateService());
        System.out.println(organization.toString());

        HumanResourceDept myHrDept = (HumanResourceDept) ctx.getBean("myHrDept");
        System.out.println(myHrDept.hiringStatus(5500));

        ((ClassPathXmlApplicationContext) ctx).close();

    }
}
