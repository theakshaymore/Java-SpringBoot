package com.example.demo.rules;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements VehicleConsole {

	@Override
	public void driveSafely() {
		System.out.println("From Car: Drivesafelt");
		
	}

	@Override
	public void followRules() {
		System.out.println("Form Car: FollowRUles");
		
	}

}
