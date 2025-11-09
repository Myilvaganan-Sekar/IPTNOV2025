package com.variable;

import java.util.Scanner;

public class GetInputFromUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number[0 - 2000]: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second number [0-2000]: ");
		int num2 = scan.nextInt();
		
		int sum  = num1+num2;
		System.out.println("Sum of two numbers: "+sum);
		scan.close();
	}
}