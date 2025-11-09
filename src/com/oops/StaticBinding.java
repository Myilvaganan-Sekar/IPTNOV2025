package com.oops;

public class StaticBinding {
  
	public void basket() {
		System.out.println("Default method");
	}
	
	public void basket(String name) { // datatype
		System.out.println("Name: "+name);
	}
	
	public void basket(String name,int version) { //datatype count
		System.out.println("Name: "+name);
		System.out.println("version: "+version);
	}
	
	public void basket(int version,String name) { //datatype order
		System.out.println("version: "+version);
		System.out.println("Name: "+name);
	}
	
	public static void main(String[] args) {
		StaticBinding sBind = new StaticBinding();
		sBind.basket();
		sBind.basket("JAVA",21);
	}
	
}
