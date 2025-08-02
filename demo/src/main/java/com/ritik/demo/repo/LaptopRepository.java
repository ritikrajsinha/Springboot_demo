package com.ritik.demo.repo;

import com.ritik.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap)
    {
        System.out.println("saved in database");
    }

}
