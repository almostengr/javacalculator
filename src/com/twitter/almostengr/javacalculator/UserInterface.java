/**
 * 
 */
package com.twitter.almostengr.javacalculator;

import java.util.Scanner;

import javax.swing.plaf.InputMapUIResource;

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

			System.out.println("");
			
			switch(i) {
				case "1":
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
					SalesTax calcSalesTax = new SalesTax();
					
					System.out.print("Calculating sales tax...");
					
					System.out.print("Amount");
					calcSalesTax.setAmount(inputText.nextDouble());
					
					System.out.print("Tax Rate");
					calcSalesTax.setTaxRate(inputText.nextDouble());
					
					calcSalesTax.calculateSalesTax();
					
					break;
					
				case "3":
					SalesTax calcSalesTaxDiscount = new SalesTax();
					
					System.out.print("Calculating sales tax...");
					
					System.out.print("Amount");
					calcSalesTaxDiscount.setAmount(inputText.nextDouble());
					
					System.out.print("Tax Rate");
					calcSalesTaxDiscount.setTaxRate(inputText.nextDouble());
					
					System.out.print("Discount Rate: ");
					calcSalesTaxDiscount.setDiscountPercent(inputText.nextDouble());
					
					calcSalesTaxDiscount.calculateSalesTax();
					break;
					
				case "4":
					SimpleInterest calcSimpleInterest = new SimpleInterest();
					
					System.out.print("Calculating simple interest...");
					
					System.out.print("Principal: ");
					calcSimpleInterest.setPrincipal(inputText.nextDouble());
					
					System.out.print("Interest: ");
					calcSimpleInterest.setInterestRate(inputText.nextDouble());
					
					System.out.print("Time: ");
					calcSimpleInterest.setTime(inputText.nextDouble());
					
					calcSimpleInterest.calculateSimpleInterest();
					break;
				
				case "5":
					LoanAmortization calcLoanAmortization = new LoanAmortization();
					
					System.out.print("Calculating loan amortization...");
					
					System.out.print("Principal: ");
					calcLoanAmortization.setPrincipal(inputText.nextDouble());
					
					System.out.print("Interest: ");
					calcLoanAmortization.setInterestRate(inputText.nextDouble());
					
					System.out.print("Pay Periods: ");
					calcLoanAmortization.setPayPeriods(inputText.nextInt());
					
					calcLoanAmortization.calcLoanAmortization();
					break;
				
				case "6":
					RateOfReturn calcRoR = new RateOfReturn();
					
					System.out.println("Calculating rate of return...");
					
					System.out.print("Initial value: ");
					calcRoR.setInitialValue(inputText.nextDouble());
					
					System.out.print("Final value: ");
					calcRoR.setFinalValue(inputText.nextDouble());
					
					calcRoR.calcRateOfReturn();
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
		
		// exit the scanner
		inputText.close();
	}

	private static void mainMenu() {
		System.out.println("MAIN MENU");
		System.out.println("-----------");
		System.out.println("1) Compound Interest");
		System.out.println("2) Sales Tax");
		System.out.println("3) Sales Tax with Discount");
		System.out.println("4) Simple Interest");
		System.out.println("5) Loan Amortization");
		System.out.println("6) Rate Of Return");
		System.out.println("Q) Exit Calculator");
		System.out.println("");
		System.out.print("Enter your selection: ");
	}
}
