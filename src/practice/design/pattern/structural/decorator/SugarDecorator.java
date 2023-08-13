package practice.design.pattern.structural.decorator;

/**
 * Concrete Implementation of CoffeeDecorator
 * 
 * @author Akash Sharma
 *
 */
public class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Sugar";
	}

	@Override
	public Double getCost() {
		return super.getCost() + 14;
	}
}
