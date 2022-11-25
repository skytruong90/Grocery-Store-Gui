
public class IDValidator {
	
	public boolean isIdValidProduct(int productID) {
		int length = String.valueOf(productID).length();
		if(length == 4) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isIdValidCustomer(int customerID) {
		int length = String.valueOf(customerID).length();
		if(length == 4) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isIdValidOrder(int orderID) {
		int length = String.valueOf(orderID).length();
		if(length == 6) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isIdValidStore(int storeID) {
		int length = String.valueOf(storeID).length();
		if(length == 2) {
			return true;
		}
		else {
			return false;
		}
	}
}
