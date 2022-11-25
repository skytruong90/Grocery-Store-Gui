import java.util.ArrayList;

public class StoreController {

	//private StoreGui gui;
	private Store store;
		
//		public StoreController(StoreGui gui) {
//			this.gui = gui;
//		}
		
		public void createStore(int storeID, String storeName) {
			IDValidator checkID = new IDValidator(); 
			MapPersistence storeBuilder = new MapPersistence();
			if(checkID.isIdValidStore(storeID)) {
				this.store = storeBuilder.buildStore(storeID, storeName);
			}
			//invalid id
		}
	
		public void registerCustomer(int customerID, String firstName, String lastName) {
			
			IDValidator checkID = new IDValidator(); 
			
			if(checkID.isIdValidCustomer(customerID)) {
				if(!store.containsCustomer(customerID)) {
					Customer c = new Customer(customerID, firstName, lastName);
					store.addCustomer(c);
					//add confirmation here
				}
				//already exists
			}
			//invalid id
		}
		

		public void printDisplayCustomers() {
			ArrayList<Customer> allCustomers = store.displayCustomers();
			System.out.println("There are " + allCustomers.size() + " customers in the system.\n");
			for(int i = 0; i < allCustomers.size(); i++) {
				System.out.println(allCustomers.get(i));
			}
			//gui stuff here
		}
		
		public void updateTaxes(double foodTax, double nonFoodTax) {
			store.setFoodTax(foodTax);
			store.setNonFoodTax(nonFoodTax);
		}
		
		//legwork for this is not done
		public void displayPopularProducts(){
			

		}
		
}
