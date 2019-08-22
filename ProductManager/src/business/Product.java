//package ~~ namespace in C#
package business;

public class Product {
	private String code;
	private String description;
	private double price;
	
//	public Product() {
//		
//	}
	public Product() {
		// calls the super class constructor
		super();
	}

	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String inCode) {
		code = inCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + 
				", price=" + price + "]";
	}
	
	


	
}
