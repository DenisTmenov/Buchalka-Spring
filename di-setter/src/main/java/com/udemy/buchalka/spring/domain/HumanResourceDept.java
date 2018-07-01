package com.udemy.buchalka.spring.domain;

import com.udemy.buchalka.spring.service.RecruitmentService;

public class HumanResourceDept implements Department {
    private String departmentName;
    private RecruitmentService recruitmentService;
    private Organization organization;

    public HumanResourceDept(RecruitmentService recruitmentService, Organization organization) {
        this.recruitmentService = recruitmentService;
        this.organization = organization;
    }

    public HumanResourceDept(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String hiringStatus(int numberOfRecruitment) {
        return recruitmentService.recruitmentEmployees(organization.getCompanyName(), departmentName, numberOfRecruitment);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public RecruitmentService getRecruitmentService() {
        return recruitmentService;
    }

    public void setRecruitmentService(RecruitmentService recruitmentService) {
        this.recruitmentService = recruitmentService;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
