package practice.design.pattern.structural.proxy;

/**
 * Real Internet which will actually perform the operation
 * 
 * @author Akash Sharma
 *
 */
public class RealInternet implements Internet {

	public RealInternet() {
		initialize();
	}

	@Override
	public void connectTo(String site) {
		System.out.println("Connecting to " + site);
	}

	// Perform complex operation required to initialize object
	private void initialize() {
		System.out.println("Performing some complex initialization operation");
	}

}
