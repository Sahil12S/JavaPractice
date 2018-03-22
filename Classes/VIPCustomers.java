/**
 * Author: SAHIL SHARMA
 * Created on Mar 21, 2018
 */
package udemy;


public class VIPCustomers {
	private String name;
	private double creditLimit;
	private String email;
	
	public VIPCustomers() {
		this.name = "Default";
		this.creditLimit = 0.0;
		this.email = "abc@xyz.com";
	}
	
	public VIPCustomers(String name, String email) {
		this(name, 100.0, email);
	}
	
	public VIPCustomers(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the creditLimit
	 */
	public double getCreditLimit() {
		return creditLimit;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	
}
