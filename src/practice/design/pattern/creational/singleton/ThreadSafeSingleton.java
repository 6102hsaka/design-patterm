package practice.design.pattern.creational.singleton;

/**
 * Singleton class with Thread safety
 * 
 * @author Akash Sharma
 *
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance = null;

	// private constructor is not accessible from outside
	private ThreadSafeSingleton() {
	}

	// static method to get instance of class
	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			// only one thread can access this block, so even in multi-threaded environment
			// only one instance will be created
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
