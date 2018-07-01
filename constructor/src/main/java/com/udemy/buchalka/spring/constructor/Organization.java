package com.udemy.buchalka.spring.constructor;

public class Organization {
    private String companyName;
    private int yearOfIncorparation;


    public Organization(String companyName, int yearOfIncorparation) {
        this.companyName = companyName;
        this.yearOfIncorparation = yearOfIncorparation;
    }

    public void slogan() {
        String slogan = "We are the best company in the world!!!";
        System.out.println(slogan);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", yearOfIncorparation=" + yearOfIncorparation +
                '}';
    }
}
