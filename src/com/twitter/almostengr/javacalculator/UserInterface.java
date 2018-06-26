/**
 * 
 */
package com.twitter.almostengr.javacalculator;

import java.util.Scanner;

/**
 * @author almostengineer
 *
 */
public class UserInterface {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inputText = new Scanner(System.in);
		String i = null;
	
		mainMenu();
		i = inputText.nextLine();
		
		while (i != "Q") {
			switch(i) {
				case "1":
					System.out.println("");
					CompoundInterest calculation = new CompoundInterest();
					
					System.out.println("Calculating compound interest...");
					
					System.out.print("Principal: ");
					calculation.setPrincipal(inputText.nextDouble());
					
					System.out.print("Interest Rate: ");
					calculation.setInterestRate(inputText.nextDouble());
					
					System.out.print("Compounded Per Year: ");
					calculation.setCompounded(inputText.nextInt());
					
					System.out.print("Number of Years: ");
					calculation.setYears(inputText.nextInt());
					
					calculation.calculateCompoundInterest();
					
					break;
					
				case "2": 
					System.out.println("");
					SalesTax calcSalesTax = new SalesTax();
					
					System.out.println("Calculating sales tax...");
					
					System.out.println("Amount");
					calcSalesTax.setAmount(inputText.nextDouble());
					
					System.out.println("Tax Rate");
					calcSalesTax.setTaxRate(inputText.nextDouble());
					
					calcSalesTax.calculateSalesTax();
					
					break;
					
				case "3":
					System.out.println("");
					SalesTax calcSalesTaxDiscount = new SalesTax();
					
					System.out.println("Calculating sales tax...");
					
					System.out.println("Amount");
					calcSalesTaxDiscount.setAmount(inputText.nextDouble());
					
					System.out.println("Tax Rate");
					calcSalesTaxDiscount.setTaxRate(inputText.nextDouble());
					
					System.out.println("Discount Rate: ");
					calcSalesTaxDiscount.setDiscountPercent(inputText.nextDouble());
					
					calcSalesTaxDiscount.calculateSalesTax();
					break;
					
					
				case "Q":
				case "q":
					System.out.println("Good bye!");
					System.exit(0);
					break;
					
				default: 
					System.out.println("Incorrect selection. Please try again.");
					System.out.println("");
					System.out.println("");
			}

			mainMenu();
			i = inputText.nextLine();
		}
	}

	private static void mainMenu() {
		System.out.println("MAIN MENU");
		System.out.println("-----------");
		System.out.println("1) Compound Interest");
		System.out.println("2) Sales Tax");
		System.out.println("Q) Exit Calculator");
		System.out.println("");
		System.out.print("Enter your selection: ");
	}
}
