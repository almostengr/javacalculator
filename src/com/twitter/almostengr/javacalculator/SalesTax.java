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
	private static double discountdollar = 0;
	private static double discountPercent = 0;
	
	public static double getDiscountdollar() {
		return discountdollar;
	}
	public static void setDiscountdollar(double discountdollar) {
		SalesTax.discountdollar = discountdollar;
	}
	public static double getDiscountPercent() {
		return discountPercent;
	}
	public static void setDiscountPercent(double discountPercent) {
		SalesTax.discountPercent = discountPercent;
	}
	public static double getTaxRate() {
		return taxRate;
	}
	public static void setTaxRate(double taxRate) {
		SalesTax.taxRate = taxRate / 100;
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
		
		double totalDiscount = amount * (1 - discountPercent);
		double total = (amount * (1 + taxRate));
		
		if (discountPercent > 0) {
			total = total - totalDiscount;
		}
		
		setAmount(total);
		System.out.println("Sales Total: " + total);
	}
}


