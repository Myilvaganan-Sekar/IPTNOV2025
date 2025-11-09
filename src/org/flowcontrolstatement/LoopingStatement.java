package org.flowcontrolstatement;

public class LoopingStatement {

	public static void main(String[] args) {
		/* for: 1 to 5 print
		 * syntax: 
		 * for(starting point;endpoint[condition];inc/dec){
		 * statement;
		 * }
		 */
		System.out.println("****** For looping **********");
		for(int i= 10;i >= 5; i--) {// i++ = i+1;
			System.out.println(i);
		}
		
		System.out.println("****** While looping **********");
		/*Entry criteria looping statement
		 * Syntax:
		 * Starting point;
		 * while(condition){
		 * statements;
		 * inc/dec;
		 * }
		 */
		
		int a = 1;//4
		while(a <= 5) {
			if(a == 2 || a == 4) {
				a++;				
				continue;
			}
			System.out.println(a);	
			a++;
		}
		
		System.out.println("************** do while **************");
		/* do while: Exit criteria looping statement 
		 * Syntax:
		 * starting point;
		 * do{
		 *   statements;
		 *   inc/dec;
		 * }while(condition);
		 */
		
		int b =16; //16 to 20
		do {
			System.out.println(b);
			b++;
		}while(b < 21);
		
	}	
}
