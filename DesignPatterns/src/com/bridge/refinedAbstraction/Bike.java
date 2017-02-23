package com.bridge.refinedAbstraction;

import com.bridge.abstraction.Vehicle;
import com.bridge.implementor.Workshop;

public class Bike extends Vehicle {

	public Bike(Workshop produceWorkshop, Workshop assembleWorkshop) {
		super(produceWorkshop, assembleWorkshop);
	}

	@Override
	public void produceVehicle() {
		System.out.println("Produce Bike");
        getProduceWorkshop().doWork();  		
	}

	@Override
	public void assembleVehcile() {
		System.out.println("Assemble Bike");
		getAssembleWorkshop().doWork();
	}
}
