package practice.design.pattern.structural.flyweight;

/**
 * Product class
 * 
 * @author Akash Sharma
 *
 */
public class Product {
	private Integer productId;
	private String name;
	private String description;
	private String price;
	private ProductFlyweight productFlyweight;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public ProductFlyweight getProductFlyweight() {
		return productFlyweight;
	}

	public void setProductFlyweight(ProductFlyweight productFlyweight) {
		this.productFlyweight = productFlyweight;
	}

	public void getProductInfo() {
		System.out.println("[productId=" + productId + ", name=" + name + ", description=" + description + ", price="
				+ price + ", productFlyweight=" + productFlyweight + "]");
	}
}
