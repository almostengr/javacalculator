package com.twitter.almostengr.javacalculator;

public class SimpleInterest {
	private static double principal; 
	private static double interestRate;
	private static double time; 
	private static double total;
	
	public static double getPrincipal() {
		return principal;
	}

	public static void setPrincipal(double principal) {
		SimpleInterest.principal = principal;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		SimpleInterest.interestRate = interestRate;
	}

	public static double getTime() {
		return time;
	}

	public static void setTime(double time) {
		SimpleInterest.time = time;
	}

	public static void calculateSimpleInterest() {
		// A = p * 1+ rt)
		total = principal * (1 + (interestRate * time));
		System.out.println("Total Accrued Amount: " + total);
	}
}
