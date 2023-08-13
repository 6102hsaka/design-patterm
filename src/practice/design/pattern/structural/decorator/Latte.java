package practice.design.pattern.structural.decorator;

/**
 * Concrete Implementation of Coffee
 * 
 * @author Akash Sharma
 *
 */
public class Latte implements Coffee {

	@Override
	public String getDescription() {
		return "Latte";
	}

	@Override
	public Double getCost() {
		return 70.0;
	}

}
