import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;

public class Store {
	
	private LinkedHashMap<Integer, Customer> store;
	private int storeID;
	private String storeName;
	private Inventory storeInventory;
	private double foodTax;
	private double nonFoodTax;
	
	public Store(int storeID, String storeName) {
		store = new LinkedHashMap<Integer, Customer>();
		this.storeID = storeID;
		this.storeName = storeName;
		MapPersistence storeMaps = new MapPersistence();
		storeInventory = storeMaps.buildInventory();
		foodTax = 0.04;
		nonFoodTax = 0.08;
	}
	
	public boolean containsCustomer(int customerID) {
		return store.containsKey(customerID);
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public int getStoreID() {
		return storeID;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	
	public void addCustomer(Customer c) {
		store.put(c.getCustomerID(), c);
	}
	
	public int getStoreSize() {
		return store.size();
	}
	
	public Inventory getStoreInventory() {
		return storeInventory;
	}
	
	public ArrayList<Customer> displayCustomers() {
		ArrayList<Customer> allCustomers = new ArrayList<Customer>(store.values());
		Collections.sort(allCustomers, new Comparator<Customer>() {
			@Override
			public int compare(Customer c1, Customer c2) {
				if(c1.getFirstName().compareToIgnoreCase(c2.getFirstName()) == 0) {
					if(c1.getLastName().compareToIgnoreCase(c2.getLastName()) == 0) {
						if(c1.getCustomerID() > c2.getCustomerID()) {
							return 1;
						}
						return -1;
					}
					return c1.getLastName().compareToIgnoreCase(c2.getLastName());
				}
				return c1.getFirstName().compareTo(c2.getFirstName());
		    }
		});
		return allCustomers;
	}
	
	public double getFoodTax() {
		return foodTax;
	}
	
	public void setFoodTax(double foodTax) {
		this.foodTax = foodTax;
	}
	
	public double getNonFoodTax() {
		return nonFoodTax;
	}
	
	public void setNonFoodTax(double nonFoodTax) {
		this.nonFoodTax = nonFoodTax;
	}
}
