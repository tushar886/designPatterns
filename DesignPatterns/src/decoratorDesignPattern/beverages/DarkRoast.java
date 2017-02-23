package decoratorDesignPattern.beverages;

import decoratorDesignPattern.Beverage;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		this.setDescription("DarkRoast");
	}
	
	@Override
	public double cost() {
		return 0.99;
	}
}
