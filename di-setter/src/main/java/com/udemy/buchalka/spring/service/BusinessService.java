package com.udemy.buchalka.spring.service;

import java.util.Random;

public interface BusinessService {
    int revenue = 1_000_000;
    Random random = new Random();

    String offerService(String companyName);
}
