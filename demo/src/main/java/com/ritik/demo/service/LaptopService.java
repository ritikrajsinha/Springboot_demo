package com.ritik.demo.service;

import com.ritik.demo.model.Laptop;
import com.ritik.demo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {


    @Autowired
    LaptopRepository repository;

    public void addlaptop(Laptop lap)
    {
        repository.save(lap);

    }
    public boolean isGood()
    {
        return true;
    }
}
