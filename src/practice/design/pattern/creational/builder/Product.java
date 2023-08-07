package practice.design.pattern.creational.builder;

import java.util.Date;

/**
 * Product class built with Builder Pattern
 * 
 * @author Akash Sharma
 *
 */
public class Product {
	private Integer productId;
	private String productName;
	private Boolean isAvailable;
	private Double price;
	private Date manufacturingDate;
	private Date expiryDate;

	// ProductBuilder instance is used to initialize instance variable
	private Product(ProductBuilder productBuilder) {
		this.productId = productBuilder.productId;
		this.productName = productBuilder.productName;
		this.isAvailable = productBuilder.isAvailable;
		this.price = productBuilder.price;
		this.manufacturingDate = productBuilder.manufacturingDate;
		this.expiryDate = productBuilder.expiryDate;
	}

	public Integer getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public Double getPrice() {
		return price;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", isAvailable=" + isAvailable
				+ ", price=" + price + ", manufacturingDate=" + manufacturingDate + ", expiryDate=" + expiryDate + "]";
	}

	/**
	 * static method to get instance of ProductBuilder
	 * 
	 */
	public static ProductBuilder builder() {
		return new ProductBuilder();
	}

	/**
	 * static inner builder class
	 * 
	 * @author Akash Sharma
	 *
	 */
	public static class ProductBuilder {
		private Integer productId;
		private String productName;
		private Boolean isAvailable;
		private Double price;
		private Date manufacturingDate;
		private Date expiryDate;

		public ProductBuilder productId(Integer productId) {
			this.productId = productId;
			return this;
		}

		public ProductBuilder productName(String productName) {
			this.productName = productName;
			return this;
		}

		public ProductBuilder isAvailable(Boolean isAvailable) {
			this.isAvailable = isAvailable;
			return this;
		}

		public ProductBuilder price(Double price) {
			this.price = price;
			return this;
		}

		public ProductBuilder manufacturingDate(Date manufacturingDate) {
			this.manufacturingDate = manufacturingDate;
			return this;
		}

		public ProductBuilder expiryDate(Date expiryDate) {
			this.expiryDate = expiryDate;
			return this;
		}

		/**
		 * 
		 * @return Instance of Product
		 */
		public Product build() {
			return new Product(this);
		}
	}
}
