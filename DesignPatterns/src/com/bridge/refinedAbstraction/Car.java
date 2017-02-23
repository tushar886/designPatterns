package com.bridge.refinedAbstraction;

import com.bridge.abstraction.Vehicle;
import com.bridge.implementor.Workshop;

public class Car extends Vehicle {

	public Car(Workshop produceWorkshop, Workshop assembleWorkshop) {
		super(produceWorkshop, assembleWorkshop);
	}

	@Override
	public void produceVehicle() {
		System.out.println("Produce Car: ");
		getProduceWorkshop().doWork();
	}

	@Override
	public void assembleVehcile() {
		System.out.println("Assemble Car: ");
		getAssembleWorkshop().doWork();
	}
}
