package com.udemy.buchalka.spring.serviceimpl;

import com.udemy.buchalka.spring.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {
    @Override
    public String offerService(String companyName) {
        return "\nAs an organization " + companyName + "provides an Ecommerce platform."
                + "\nThe annual income exceeds " + random.nextInt(revenue) + " dollars.";

    }
}
