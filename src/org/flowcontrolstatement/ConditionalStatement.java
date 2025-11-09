package org.flowcontrolstatement;

public class ConditionalStatement {

	public static void main(String[] args) {
		System.out.println("************ if statement *************");
		int day = 1;
		if (day == 1) {
			System.out.println("Welcome");
			System.out.println("To");
			System.out.println("Java");
		}
		
		System.out.println("************ if else statement *************");
		int age = 4;
		if(age >= 6) {
			System.out.println("Please pay the entry fees");	
		}else {
			System.out.println("No Entry fees for children below 6 age");
		}
		/*
		 * 50 to 60  B
		61 to 70  A
		71 to 80  A+
		81 to 90  O
		91 to 100  O+
		 */
		
		System.out.println("************ if else if statement *************");
		
		int mark = 96;
		if(mark >= 91 && mark <= 100) {
			System.out.println("Your obtained Grade is O+ for the score of: "+mark);
		}else if(mark >= 81 && mark <= 90) {
			System.out.println("Your obtained Grade is O for the score of: "+mark);
		}else if(mark >= 71 && mark <= 80) {
			System.out.println("Your obtained Grade is A+ for the score of: "+mark);
		}else if(mark >= 61 && mark <= 70) {
			System.out.println("Your obtained Grade is A for the score of: "+mark);
		}else if(mark >= 50 && mark <= 60) {
			System.out.println("Your obtained Grade is B for the score of: "+mark);
		}else if(mark >= 0 && mark <= 49) {
			System.out.println("Please try again you have 2 more chances: "+mark);
		}else {
			System.out.println("Please enter the valid mark: "+mark);
		}
		
		System.out.println("******* Nested If**************");
		/*
		 * Indian, Age>= 18
		 */
		
		String citizen = "Indian";
		age = 19;
		
		if(citizen.equals("Indian")) {
			System.out.println("Your eligible to apply for voter id upon completing 18 years old");
			if(age >= 18) {
				System.out.println("Your are eligible to apply for voter id");
			}
		}
		
	}
}
