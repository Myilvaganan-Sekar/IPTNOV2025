package com.keywords;

public final class ExampleFinal {
/* final -- > block not applicable, method,variable, class 
 * variable - we can't reassign it
 */
	//Task? Overriding --> Two class --> have the same method name and arguments
	
	final int a = 10;
	public static void main(String[] args) {
		ExampleFinal fin = new ExampleFinal();
		System.out.println("A: "+fin.a);
	}
	
	
}
