package practice.design.pattern.structural.decorator;

/**
 * Concrete Implementation of CoffeeDecorator
 * 
 * @author Akash Sharma
 *
 */
public class MilkDecorator extends CoffeeDecorator {
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Milk";
	}

	@Override
	public Double getCost() {
		return super.getCost() + 10;
	}
}
