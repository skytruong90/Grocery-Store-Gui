import java.util.ArrayList;
import java.util.Date;

public class OrderController {

//	private StoreGui gui;
	private Order order;
	
//	public OrderController(StoreGui gui) {
//		this.gui = gui;
//	}
	
	public void createOrder(int orderID, int customerID, Date date, boolean usingSnap, boolean isPaid, Store store) {
		IDValidator checkID = new IDValidator(); 
		MapPersistence orderBuilder = new MapPersistence();
		if(checkID.isIdValidOrder(orderID)) {
			this.order = orderBuilder.buildOrder(orderID, customerID, date, usingSnap, isPaid, store);
		}
		//invalid id
	}
	
	public void addToOrder(int productID, int quantity, String productName, double price, String manufacturer, boolean isFood) {
		ArrayList<Product> allProductsName = order.getStore().getStoreInventory().productReportName();
		for(int i = 0; i < allProductsName.size(); i++) {
			System.out.println(allProductsName.get(i));
		}
		//need way to then select the product from gui
		//this may need to be split into two methods for the gui, the top part for just displaying which then calls the bottom part when a product is clicked on
		Product p = new Product(productID, quantity, productName, price, manufacturer, isFood);
		order.addProduct(p);
	}

	public void payOrder() {
		order.setisPaid(true);
		order.orderReport();
		//need to figure out how to number each item and use Inventory
			// for(int i = 0; i < order.length; i++){
			// 	order.getStore().getStoreInventory().decreaseQuantity(0, 0);
			// }
			
	}

	public void returnItem(int productID, int quantity){

		order.getStore().getStoreInventory().increaseQuantity(productID, quantity);
		order.returnProduct(productID);
	}
}
