package practice.design.pattern.creational.singleton;

/**
 * Singleton class with Lazy Initialization
 * 
 * @author Akash Sharma
 *
 */
public class LazySingleton {
	private static LazySingleton instance = null;

	// private constructor is not accessible from outside
	private LazySingleton() {
	}

	// static method to get instance of class
	public static LazySingleton getInstance() {
		if (instance == null) {
			// instance is created at request time
			instance = new LazySingleton();
		}
		return instance;
	}
}
