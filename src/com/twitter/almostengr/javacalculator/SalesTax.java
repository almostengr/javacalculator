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
	private static double salesTotal;
	
	public static double getTaxRate() {
		return taxRate;
	}
	public static void setTaxRate(double taxRate) {
		SalesTax.taxRate = taxRate;
	}
	public static double getAmount() {
		return amount;
	}
	public static void setAmount(double amount) {
		SalesTax.amount = amount;
	}
	public static double getSalesTotal() {
		return salesTotal;
	}
	public static void setSalesTotal(double salesTotal) {
		SalesTax.salesTotal = salesTotal;
	}
	
	public void calculateSalesTax() {
		// sales tax formula
		// total = amount + (1 + taxrate)
		
		double total = amount * (1 + taxRate);
		
		setAmount(total);
		System.out.println("Sales Total: " + total);
	}
}
