package com.oops;

public class Encapsulation {
//Addition of two numbers logic [10,20] [20,30] [30,40] - 3 * 6 = 18+3 = 21 [7]
	// Readability and Maintainable
	// Binding the code and data into a single entity or unit - Encapsulation
	protected void mulOfTwoNumber(int num1, int num2) { // data
		int mul = num1 * num2; // code or logic
		System.out.println("mul: " + mul);
	}

	public static void main(String[] args) {
		Encapsulation enc = new Encapsulation();
		enc.mulOfTwoNumber(10, 20);
		enc.mulOfTwoNumber(20, 30);
		enc.mulOfTwoNumber(30, 40);
	}
	
	/*Access Modifier: public,private,protected,default[not keyword]
	 * Public --> Scope through out the project
	 * private --> Scope within the class
	 * default --> Scope only within the package
	 * protected ---> Scope inside the package , to access it outside achieved with 
	 * sub class object
	 */
/*1.Encapsulation
 * 2.Inheritance
 * 3.Polymorphism
 * 4.Abstraction
 * 
 */
}
