package practice.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory class to manage pool of flyweight objects
 * 
 * @author Akash Sharma
 *
 */
public class FlyweightFactory {
	private static Map<String, ProductFlyweight> cachedFlyweight = new HashMap<>();

	public static ProductFlyweight getFlyweightInstance(String category, String seller) {
		String key = category + "-" + seller;
		ProductFlyweight productFlyweight = cachedFlyweight.get(key);
		if (productFlyweight != null) {
			productFlyweight = new ProductFlyweight(category, seller);
			cachedFlyweight.put(key, productFlyweight);
		}
		return productFlyweight;
	}
}
