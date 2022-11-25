
public class Product {
	
	
	private String productName;
	private double price;
	private String manufacturer;
	private int productID;
	private boolean isFood;
	private int quantity;
	
	
	//Constructor of the Product which has the name, price, manufacturer, id, and specifies if product is food.
	public Product(int productID, int quantity, String productName, double price, String manufacturer, boolean isFood) {
		this.productName = productName;
		this.price = price;
		this.manufacturer = manufacturer;
		this.productID = productID;
		this.isFood = isFood;
		this.quantity = quantity;
	}
	
	
	//Getters
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getProductID() {
		return productID;
	}
	public boolean getIsFood() {
		return isFood;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getTotalValue() {
		return price * quantity;
	}
	
	//Setters
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public void setIsFood(boolean isFood) {
		this.isFood = isFood;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	@Override
	public String toString() {
		String ts = String.format("Product ID - %d , Quantity - %d , Product Name - %s , Price - $%d , Manufacturer - %s , Food Item - %b", productID, quantity, productName, price, manufacturer, isFood);
		return ts;
	}

}