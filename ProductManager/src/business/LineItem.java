package business;

public class LineItem {
	private Product product;
	private double quantity;
	public LineItem(Product product, double quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	public LineItem() {
		super();
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
}
