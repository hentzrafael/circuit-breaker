package com.hentzrafael.rate_service.services;


import com.hentzrafael.rate_service.entities.Rate;
import com.hentzrafael.rate_service.repositories.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateService {

    @Autowired
    private RateRepository repository;

    public Rate getRateByType(String type) {
        return repository.findByType(type).orElseThrow(() -> new RuntimeException("Rate Not Found: " + type));
    }
}