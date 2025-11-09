package org.flowcontrolstatement;

public class StatementReturn {

	public int scoreOfTeamA() {
		int scoreA = 6; // Local Variable
		return scoreA;
		
	}
	
	public void scoreOfTeamB() {
		int scoreB = 8;
		System.out.println("scoreB: "+scoreB);
	}
	
	public static void main(String[] args) {
		StatementReturn state = new StatementReturn();
		state.scoreOfTeamA();
		state.scoreOfTeamB();
		System.out.println(state.scoreOfTeamA());
		
		/* To access the value or information store in the local can be 
		 * accessed with help of return keyword through a method level
		 */
	}
	
	
}
