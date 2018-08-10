package com.twitter.almostengr.javacalculator;

public class RateOfReturn {
	private static double initialValue; 
	private static double finalValue;
	
	/**
	 * Performs the rate of return calculation
	 */
	public static void calcRateOfReturn() {
		double rate;
		double percentageRate;
		
		rate = (finalValue - initialValue) / initialValue;
		percentageRate = rate * 100;
		System.out.println("Rate of Return: " + percentageRate + "%");
	}

	/**
	 * Sets the starting value 
	 * @param initialValue The first value
	 */
	public static void setInitialValue(double initialValue) {
		RateOfReturn.initialValue = initialValue;
	}

	/**
	 * Sets the final value
	 * @param finalValue The last value
	 */
	public static void setFinalValue(double finalValue) {
		RateOfReturn.finalValue = finalValue;
	}
}
