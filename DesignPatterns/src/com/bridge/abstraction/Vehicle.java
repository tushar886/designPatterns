package com.bridge.abstraction;

import com.bridge.implementor.Workshop;

public abstract class Vehicle {

	private Workshop produceWorkshop;
	private Workshop assembleWorkshop;
	
	public Vehicle( final Workshop produceWorkshop, final Workshop assembleWorkshop) {
		this.produceWorkshop = produceWorkshop;
		this.assembleWorkshop = assembleWorkshop;
	}
	
	public Workshop getProduceWorkshop() {
		return produceWorkshop;
	}


	public Workshop getAssembleWorkshop() {
		return assembleWorkshop;
	}

	public abstract void produceVehicle();
	public abstract void assembleVehcile();
}
