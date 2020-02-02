package com.thealmostengineer.javacalculator;

public class SimpleInterest {
	private static double principal; 
	private static double interestRate;
	private static double time;
	
	public static void setPrincipal(double principal) {
		SimpleInterest.principal = principal;
	}

	public static void setInterestRate(double interestRate) {
		SimpleInterest.interestRate = interestRate;
	}

	public static void setTime(double time) {
		SimpleInterest.time = time;
	}

	public static void calculateSimpleInterest() {
		double total;
		
		// A = p * 1+ rt)
		total = principal * (1 + (interestRate * time));
		System.out.println("Total Accrued Amount: " + total);
	}
}
