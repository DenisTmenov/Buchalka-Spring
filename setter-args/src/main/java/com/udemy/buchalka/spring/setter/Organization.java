package com.udemy.buchalka.spring.setter;

public class Organization {
    private String companyName;
    private int yearOfIncorparation;
    private String postcalCode;
    private int employeeCount;


    public Organization(String companyName, int yearOfIncorparation) {
        this.companyName = companyName;
        this.yearOfIncorparation = yearOfIncorparation;
    }

    public void slogan() {
        String slogan = "We are the best company in the world!!!";
        System.out.println(slogan);
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
    //</editor-fold>


    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", yearOfIncorparation=" + yearOfIncorparation +
                ", postcalCode='" + postcalCode + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}
