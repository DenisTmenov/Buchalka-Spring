package com.udemy.buchalka.spring.serviceimpl;

import com.udemy.buchalka.spring.service.BusinessService;

public class CloudServiceImpl implements BusinessService {
    @Override
    public String offerService(String companyName) {
        return "\nAs an organization " + companyName + "offers world class Cloud computing infrastructure."
                + "\nThe annual income exceeds " + random.nextInt(revenue) + " dollars.";
    }
}
