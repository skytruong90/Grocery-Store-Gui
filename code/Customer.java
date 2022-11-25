
public class Customer {

	private int customerID;
	private String firstName;
	private String lastName;
	
	public Customer(int customerID, String firstName, String lastName) {
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	//getters
	public int getCustomerID() {
		return customerID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	//setters
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		String ts = String.format("Customer ID - %d , First Name - %s , Last Name - %s\n", customerID, firstName, lastName);
		return ts;
	}
	
	
}
