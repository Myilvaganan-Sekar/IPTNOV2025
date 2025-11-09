package org.operators;

public class Calculator {
	int c;

	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println(123456);
		Calculator regName = new Calculator(); // Object
		regName.cricket(); // method calling statement
		System.out.println("int c: "+regName.c); // variable calling statement
		regName.c += 2;
		System.out.println("int c: "+regName.c); // variable
		
		System.out.println(12 != 10);
	}

	// Concrete method

	public void cricket() {
		System.out.println("Logic for the cricket method");

	}
}
