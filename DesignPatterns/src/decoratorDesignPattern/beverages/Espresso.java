package decoratorDesignPattern.beverages;

import decoratorDesignPattern.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		this.setDescription("Espresso");
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
}
