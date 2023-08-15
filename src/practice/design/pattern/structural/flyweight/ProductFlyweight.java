package practice.design.pattern.structural.flyweight;

/**
 * Product Flyweight class to store Intrinsic properties
 * 
 * @author Akash Sharma
 *
 */
public class ProductFlyweight {
	private final String category;
	private final String seller;

	public ProductFlyweight(String category, String seller) {
		this.category = category;
		this.seller = seller;
	}

	public String getCategory() {
		return category;
	}

	public String getSeller() {
		return seller;
	}

	@Override
	public String toString() {
		return "ProductFlyweight [category=" + category + ", seller=" + seller + "]";
	}
}
