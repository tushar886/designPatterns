package decoratorDesignPattern.client;

import decoratorDesignPattern.Beverage;
import decoratorDesignPattern.beverages.DarkRoast;
import decoratorDesignPattern.beverages.Espresso;
import decoratorDesignPattern.beverages.HouseHoldBlend;
import decoratorDesignPattern.condiments.Mocha;
import decoratorDesignPattern.condiments.Whip;

public class DecoratorClient {

	public static void main(String[] args) {

		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " cost as: $ " + beverage.cost());
		
		Beverage darkRoastBeverage = new DarkRoast();
		darkRoastBeverage = new Mocha(darkRoastBeverage); //decorate darkRoastBeverage with Mocha
		darkRoastBeverage = new Mocha(darkRoastBeverage); // decorate it with second Mocha
		darkRoastBeverage = new Whip(darkRoastBeverage);
		
		System.out.println(darkRoastBeverage.getDescription()  + " cost as: $ " + darkRoastBeverage.cost());
		
		Beverage houseBlend = new HouseHoldBlend(); // create basic beverage HouseBlend
		houseBlend = new Whip(houseBlend); // decorate it first with Whip
		houseBlend = new Mocha(houseBlend); // next decorate it with Mocha
		
		System.out.println(houseBlend.getDescription() + " cost as: $ " + houseBlend.cost());
	}
}
