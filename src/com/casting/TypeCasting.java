package com.casting;

public class TypeCasting {
/* Types of Casting:
 * 3.Upcasting: child class Object assigned to parent class refname
 * with help of object refname --> 
 * case 1: it allows to access only the parent class methods 
 * and variable
 * case 2: when both the class have the same method and arguments -->
 *         Child class method will override the parent class method
 * 
 * 
 * 4.DownCasting
 * 1.To access the child class methods and variable
 * Syntax:
 * 
 * ChildClass refName = (ChildClass)ParentRefName;
 */
	
	
	public void apple() {
		System.out.println("Apple");
	}
	
	public void orange() {
		System.out.println("orange");
	}
}
