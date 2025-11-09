package org.flowcontrolstatement;

public class DemoSwitch {

	public static void main(String[] args) {
		int day = 2;//[0 to 6]
		
		switch(day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tuesday");
 			break;
		default:
			System.out.println("Please enter the day from 0 -2");
		
		}
	}
}
