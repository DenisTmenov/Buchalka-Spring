package com.udemy.buchalka.spring.domain;

import com.udemy.buchalka.spring.service.BusinessService;

public class Organization {
    private String companyName;
    private int yearOfIncorparation;
    private String postcalCode;
    private int employeeCount;
    private String slogan;
    private BusinessService businessService;

    public Organization(String companyName, int yearOfIncorparation) {
        this.companyName = companyName;
        this.yearOfIncorparation = yearOfIncorparation;
    }

    public String corporateService(){
        return businessService.offerService(companyName);
    }

    //<editor-fold desc="get & set">

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYearOfIncorparation() {
        return yearOfIncorparation;
    }

    public void setYearOfIncorparation(int yearOfIncorparation) {
        this.yearOfIncorparation = yearOfIncorparation;
    }

    public String getPostcalCode() {
        return postcalCode;
    }

    public void setPostcalCode(String postcalCode) {
        this.postcalCode = postcalCode;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
    }

    //</editor-fold>


    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", yearOfIncorparation=" + yearOfIncorparation +
                ", postcalCode='" + postcalCode + '\'' +
                ", employeeCount=" + employeeCount +
                ", slogan='" + slogan + '\'' +
                ", businessService=" + businessService +
                '}';
    }
}
