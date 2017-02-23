package decoratorDesignPattern;

public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription(); // all condiment decorators need to implement the getDescriptor() method.
}
