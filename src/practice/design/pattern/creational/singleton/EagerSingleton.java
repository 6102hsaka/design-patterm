package practice.design.pattern.creational.singleton;

/**
 * Singleton class with Eager Initialization
 * 
 * @author Akash Sharma
 *
 */
public class EagerSingleton {
	// instance will be created at load time
	private static EagerSingleton instance = new EagerSingleton();

	// private constructor is not accessible from outside
	private EagerSingleton() {
	}

	// static method to get instance of class
	public static EagerSingleton getInstance() {
		return instance;
	}
}
