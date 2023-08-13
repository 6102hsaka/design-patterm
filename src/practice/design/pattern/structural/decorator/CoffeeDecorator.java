package practice.design.pattern.structural.decorator;

/**
 * Abstract Decorator class
 * 
 * @author Akash Sharma
 *
 */
public abstract class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}

	@Override
	public Double getCost() {
		return decoratedCoffee.getCost();
	}
}
