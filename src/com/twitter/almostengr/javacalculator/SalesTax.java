package com.twitter.almostengr.javacalculator;

/**
 * Calculates the sales tax for a given amount and tax rate.
 * 
 * @author almostengineer
 *
 */
public class SalesTax {	
	private static double taxRate;
	private static double amount;
	private static double discountPercent = 0;
	
	public static void setDiscountPercent(double discountPercent) {
		SalesTax.discountPercent = discountPercent / 100;
	}
	
	public static void setTaxRate(double taxRate) {
		SalesTax.taxRate = taxRate / 100;
	}
	
	public static void setAmount(double amount) {
		SalesTax.amount = amount;
	}
	
	public void calculateSalesTax() {
		// sales tax formula
		// total = amount * (1 + taxrate)
		
		double totalDiscount = amount * (1 - discountPercent);
		double total = (amount * (1 + taxRate));
		
		if (discountPercent > 0) {
			total = total - totalDiscount;
		}
		
		setAmount(total);
		System.out.println("Sales Total: " + total);
	}
}


