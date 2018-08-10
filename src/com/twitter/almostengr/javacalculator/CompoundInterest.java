package com.twitter.almostengr.javacalculator;

public class CompoundInterest {
	// compound interest
	// A = p * (1 + (r/n)) ^ (n * t)
	
	private static double principal;  // represents p
	private static double interestRate; // represents r
	private static int compounded; // represents n
	private static int years; // represents t

	public static void setPrincipal(double principal) {
		CompoundInterest.principal = principal;
	}
	
	public static void setInterestRate(double interestRate) {
		CompoundInterest.interestRate = interestRate / 100;
	}
	
	public static void setCompounded(int compounded) {
		CompoundInterest.compounded = compounded;
	}
	
	public static void setYears(int years) {
		CompoundInterest.years = years;
	}
	
	public static void calculateCompoundInterest() {
		double accumulated;
		
		// A = p * (1 + (r/n)) ^ (n * t)
		accumulated = Math.pow(principal * (1 + (interestRate / compounded)), (compounded * years));
		
		// print accumulated value
		System.out.println("Accumulated total: " + accumulated);
	}
}
