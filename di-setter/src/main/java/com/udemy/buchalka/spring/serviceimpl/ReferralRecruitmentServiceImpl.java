package com.udemy.buchalka.spring.serviceimpl;

import com.udemy.buchalka.spring.service.RecruitmentService;

import java.util.Random;

public class ReferralRecruitmentServiceImpl implements RecruitmentService {
    @Override
    public String recruitmentEmployees(String companyName, String departmentName, int numberOfRecruitments) {
        Random random = new Random();
        return "\n " + companyName + "'s " + departmentName + " hired " + random.nextInt(numberOfRecruitments)
                + " employees which were referred to the company by employees.";
    }
}
