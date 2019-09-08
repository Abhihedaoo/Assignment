package com.abhishek.practice.assignments;

public class CalculateProfit {
	public static void main(String[] args) {
		System.out.println("Income of the show :: " + calculateProfit(20));
	}
	
	static float calculateProfit(int numAttendees) {
		final int COST_PER_SHOW = 20;
		
		return (numAttendees*0.50f) + COST_PER_SHOW; 
	}
}
