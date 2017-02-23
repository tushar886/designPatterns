package com.bridge.concreteImplementation;

import com.bridge.implementor.Workshop;

public class AssembleWorkshop implements Workshop{

	@Override
	public void doWork() {
		System.out.println("Assembled");
	}
}
