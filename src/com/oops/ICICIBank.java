package com.oops;

public class ICICIBank implements Bank,RBI{

	@Override
	public void apple() {
		System.out.println("Green Apple");
	}

	@Override
	public void orange() {
		System.out.println("Green Orange");
	}

	@Override
	public void banan() {
		System.out.println("Green Banana");
	}

	
	public static void main(String[] args) {
		ICICIBank icici = new ICICIBank();
		icici.apple();
		icici.orange();
		icici.banan();
		icici.grapes();
		icici.pineApple();
	}

	@Override
	public void grapes() {
	System.out.println("Black Grapes");	
	}

	@Override
	public void pineApple() {
		System.out.println("Yellow pineApple");
	}
}
