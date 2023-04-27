package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.rules.VehicleRunner;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringFirstApplication.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringFirstApplication.class, args);
		VehicleRunner runner = context.getBean(VehicleRunner.class);
        runner.drive();
	}

}
