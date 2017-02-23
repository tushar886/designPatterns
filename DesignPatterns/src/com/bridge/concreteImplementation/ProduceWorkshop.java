package com.bridge.concreteImplementation;

import com.bridge.implementor.Workshop;

public class ProduceWorkshop implements Workshop {

	@Override
	public void doWork() {
		System.out.println("Produced");
	}
}
