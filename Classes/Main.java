/**
 * Author: SAHIL SHARMA
 * Created on Mar 20, 2018
 */
package udemy;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Account harry = new Account();
		
		harry.setNumber("00112234");
		harry.setBalance(1000.00);
		harry.setCustomerName("Harry Singh");
		harry.setEmail("harry.singh@gmail.com");
		harry.setPhone("+1-212-334-5512");
		
		System.out.println("Name: " + harry.getCustomerName() + ", Email: " + harry.getEmail() + ", Phone: " + harry.getPhone());
		System.out.println("Account No: " + harry.getNumber() + ", Balance: " + harry.getBalance());
		
		harry.depositFund(200);

		harry.withdraw(259.6);

		harry.withdraw(1259.6);

		VIPCustomers vip1 = new VIPCustomers();
		VIPCustomers vip2 = new VIPCustomers("John Wick", "john@gmail.com");
		VIPCustomers vip3 = new VIPCustomers("Adam", 500.0, "adam@hotmail.com");
		
		System.out.println("Name: " + vip1.getName() + ", Credit Limit: " + vip1.getCreditLimit() + ", Email: " + vip1.getEmail());
		System.out.println("Name: " + vip2.getName() + ", Credit Limit: " + vip2.getCreditLimit() + ", Email: " + vip2.getEmail());
		System.out.println("Name: " + vip3.getName() + ", Credit Limit: " + vip3.getCreditLimit() + ", Email: " + vip3.getEmail());
		
		
		
	}

}
