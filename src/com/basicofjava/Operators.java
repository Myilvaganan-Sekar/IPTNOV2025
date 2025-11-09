package com.basicofjava;

public class Operators {
    int a = 2000;
	public void addOfNumber() {
		int num1 =10;
		int num2 = 30;
		int sum = num1+num2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// How to call the variable and method from the class
		Operators oper = new Operators();
		System.out.println("variable a: "+oper.a); //2000
		oper.addOfNumber(); // 40
	}
	
}