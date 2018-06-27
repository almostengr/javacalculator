package com.twitter.almostengr.javacalculator;

public class RateOfReturn {
	private static double initialValue; 
	private static double finalValue;
	private static double rate;
	
	public static void calcRateOfReturn() {
		rate = (finalValue - initialValue) / initialValue;
		System.out.println("Rate of Return: " + rate);
	}

	public static void setInitialValue(double initialValue) {
		RateOfReturn.initialValue = initialValue;
	}

	public static void setFinalValue(double finalValue) {
		RateOfReturn.finalValue = finalValue;
	}
}
