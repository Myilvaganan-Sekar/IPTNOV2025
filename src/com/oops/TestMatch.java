package com.oops;

public class TestMatch extends Abstraction{

	@Override
	public void cricketScore() {
		System.out.println("Cricket score");	
	}
	
	public static void main(String[] args) {
		TestMatch tm = new TestMatch();
		tm.cricketScore();
		tm.todaysScore();
	}

}
