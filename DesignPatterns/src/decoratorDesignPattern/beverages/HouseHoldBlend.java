package decoratorDesignPattern.beverages;

import decoratorDesignPattern.Beverage;

public class HouseHoldBlend  extends Beverage {

	public HouseHoldBlend() {
		this.setDescription("HouseHoldBlend");
	}
	
	@Override
	public double cost() {
		return 0.89;
	}
	

}
