package practice.design.pattern.structural.decorator;

/**
 * Concrete Implementation of Coffee
 * 
 * @author Akash Sharma
 *
 */
public class Espresso implements Coffee {

	@Override
	public String getDescription() {
		return "Espresso";
	}

	@Override
	public Double getCost() {
		return 40.0;
	}

}
