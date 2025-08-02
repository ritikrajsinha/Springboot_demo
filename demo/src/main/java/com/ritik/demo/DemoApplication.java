package com.ritik.demo;

import com.ritik.demo.model.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.ritik.demo.service.LaptopService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		LaptopService service=context.getBean(LaptopService.class);

		Laptop lappy=context.getBean(Laptop.class);
		service.addlaptop(lappy);
	}

}
