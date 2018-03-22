/**
 * Author: SAHIL SHARMA
 * Created on Mar 20, 2018
 */
package udemy;


public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String email;
	private String phone;
	

	public Account() {
		this("1234", 0.0, "Empty Name", "Empty email", "Emtpy phone number");
	} 
	
	public Account(String number, double balance, String customerName, String email, String phone) {
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
	}
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void depositFund(double amount) {
		if(amount <= 0) {
			System.out.println("Enter valid amount to deposit.");
		} else {
			this.balance += amount;
			System.out.println("Deposited " + amount + ". Updated balance is: " + this.balance);
		}
		
	}
	
	public void withdraw(double amount) {
		if(amount > this.balance) {
			System.out.println("Insufficient Funds.");
		} else {
			this.balance -= amount;
			System.out.println("Withdrawn " + amount + ". Remaining balance is: " + this.balance);
		}
		
	}
}
