/**
 * Author: SAHIL SHARMA
 * Created on Mar 18, 2018
 */
package method_overloading;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int inches;
//		feet = 1;
		inches = 13;
		
//		double inCentimeters = calcFeetAndInchesToCentimeters(feet, inches);
		
//		System.out.println(feet + "'" + inches + "\"" + " = " + inCentimeters + " cm.");
		
		inches = 787;
		
		double inCentimeters = calcFeetAndInchesToCentimeters(inches);
		
		System.out.println(inches + "\"" + " = " + inCentimeters + " cm.");
	}
	
	public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
			if(feet < 0 || inches < 0 || inches > 12) {
				System.out.println("Invalid feet or inches.");
				return -1.0;
			}
			
			inches += feet * 12;
			
			return inches * 2.54;
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches) {
		if(inches < 0) {
			System.out.println("Invalid inches.");
			return -1;
		}
		
		int feet = (int) inches / 12;
		inches %= 12;
		
		return calcFeetAndInchesToCentimeters(feet, inches);
	}

}
/*
{ 30:0, "VMCS Revision Identifier"},
{ 31, "Always zero"},
{ 44:32, "VMXON & VMCS Region"},
{ 49, "Logical Processor Support"},
{ 53:50, "Memory Type"},
{ 54, "VM-exit Instruction-information"},
{ 55, "VMX True Controls Capability" }
*/
