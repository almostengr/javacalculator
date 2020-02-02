package com.thealmostengineer.javacalculator;

public class LoanAmortization {
	private static double principal;
	private static double interestRate;
	private static int payPeriods;
	
	public static void setPrincipal(double principal) {
		LoanAmortization.principal = principal;
	}

	public static void setInterestRate(double interestRate) {
		LoanAmortization.interestRate = interestRate / 100;
	}

	public static void setPayPeriods(int payPeriods) {
		LoanAmortization.payPeriods = payPeriods;
	}

	public static void calcLoanAmortization() {
		double paymentPerPeriod;
		
		// Loan Amortization formula
		// A = P * (( r * (1 + r) ^ n) / ((1 + r) ^ n - 1))
		
		paymentPerPeriod = principal * ((interestRate * Math.pow((1 + interestRate), payPeriods)) / (Math.pow((1 + interestRate), payPeriods) - 1));
		System.out.println("Payment Per Period: " + paymentPerPeriod);
	}
}


