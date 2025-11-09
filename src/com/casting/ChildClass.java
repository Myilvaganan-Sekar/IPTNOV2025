package com.casting;

public class ChildClass extends TypeCasting {

	
	public void banan() {
		System.out.println("banan");
	}
	
	public static void main(String[] args) {
		//upcasting
		TypeCasting casting = new ChildClass();
		casting.apple();
		casting.orange();
		
		//downcasting
		ChildClass testType = (ChildClass)casting;
		testType.banan();
		
	}
}
