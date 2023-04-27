package com.example.demo.rules;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements VehicleConsole {

	@Override
	public void driveSafely() {
		System.out.println("From Bike: DriveSafely");
		
	}

	@Override
	public void followRules() {
		System.out.println("From Bike: FollowRules");
		
	}

}
