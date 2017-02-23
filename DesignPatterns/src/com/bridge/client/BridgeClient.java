package com.bridge.client;

import com.bridge.abstraction.Vehicle;
import com.bridge.concreteImplementation.AssembleWorkshop;
import com.bridge.concreteImplementation.ProduceWorkshop;
import com.bridge.refinedAbstraction.Car;

public class BridgeClient {

	public static void main (String args[]) {
		
		Vehicle car = new Car(new ProduceWorkshop(), new AssembleWorkshop());
		car.produceVehicle();
		car.assembleVehcile();
	}
}
