package com.variable;

public class VariablesDemo {
	int a = 10; // global variable or instance or class
	double price;
	public void cricket() {
		int a = 25;
		int score = 123; // local variable
		System.out.println("Score: " + score);
		System.out.println("local variable a: " + a);//10
		System.out.println("global variable a: " + this.a);
		System.out.println("Global variable: "+price); //0.0
		float g = 0.00123f;
		System.out.println("Local variable g: "+g);
	}

	public static void main(String[] args) {
		VariablesDemo demo = new VariablesDemo();
		demo.cricket();

	}

}
