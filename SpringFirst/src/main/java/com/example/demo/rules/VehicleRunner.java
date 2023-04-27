package com.example.demo.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleRunner {

	private VehicleConsole vehicleConsole;

//	public VehicleRunner() {
//		Mario mario;
//	}

	@Autowired
	public VehicleRunner(@Qualifier ("bike") VehicleConsole vehicleConsole) {
		this.vehicleConsole = vehicleConsole;
	}

	public void drive() {
		vehicleConsole.driveSafely();
		vehicleConsole.followRules();
	}
}

