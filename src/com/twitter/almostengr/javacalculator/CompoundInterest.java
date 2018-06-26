package com.twitter.almostengr.javacalculator;

public class CompoundInterest {
	// compound interest
	// A = p * (1 + (r/n)) ^ (n * t)
	
	private static double accumulated; // represents A
	private static double principal;  // represents p
	private static double interestRate; // represents r
	private static int compounded; // represents n
	private static int years; // represents t
	
	public static double getAccumulated() {
		return accumulated;
	}
	
	public static void setAccumulated(double accumulated) {
		CompoundInterest.accumulated = accumulated;
	}
	
	public static double getPrincipal() {
		return principal;
	}
	
	public static void setPrincipal(double principal) {
		CompoundInterest.principal = principal;
	}
	
	public static double getInterestRate() {
		return interestRate;
	}
	
	public static void setInterestRate(double interestRate) {
		// CompoundInterest.interestRate = interestRate;
		CompoundInterest.interestRate = interestRate / 100;
	}
	
	public static int getCompounded() {
		return compounded;
	}
	
	public static void setCompounded(int compounded) {
		CompoundInterest.compounded = compounded;
	}
	
	public static int getYears() {
		return years;
	}
	
	public static void setYears(int years) {
		CompoundInterest.years = years;
	}
	
	public static void calculateCompoundInterest() {

		// A = p * (1 + (r/n)) ^ (n * t)
		accumulated = Math.pow(principal * (1 + (interestRate / compounded)), (compounded * years));
		
		// print accumulated value
		System.out.println("Accumulated total: " + accumulated);
	}
}
