package decoratorDesignPattern.condiments;

import decoratorDesignPattern.Beverage;
import decoratorDesignPattern.CondimentDecorator;

/**
 * This class serves as concrete decorators. Mocha is a decorator so we extend Condiment Decorator
 * @author tsrivast
 *
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}
}