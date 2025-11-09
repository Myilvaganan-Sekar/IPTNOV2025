package com.basicofjava;

public class FirstProgram {
	byte a; 
	short b;
	long c;
	float d;

	public static void main(String[] args) {
		/*
		 * Object creation or instance: ClassName objRefName = new ClassName();
		 */
		FirstProgram program = new FirstProgram();
		System.out.println("default value of byte a: " + program.a);
		System.out.println("default value of short b: " + program.b);
		System.out.println("default value of float d: " + program.d);
	}

	/*
	 * variables: To store the data/information/literal/value
	 *  Java Strictly typed programming language 
	 * [1000, JAVA, 800, 12.123,true, % ] Data Types: Primitive
	 * Datatype and Non-primitive Datatype
	 * 
	 * 1.Primitive Datatype: It is used to store single data in a variable It
	 * predefined keywords Types:
	 * byte[1byte],short[2byte],int[4byte],long[8byte],float[4byte],double[8byte],
	 * char[2byte],boolean Range calculation: -2^(n-1) to (2^(n-1))-1 [n = bit]
	 * Converstion for byte to bit: 1.byte n = 8; 2.short n = 16; 3.int n = 32
	 * 
	 * Range calculation for byte:
	 * 
	 * -2^(7) to (2^7)-1 ===> -128 to 127
	 */

}