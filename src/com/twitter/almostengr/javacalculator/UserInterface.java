/**
 * 
 */
package com.twitter.almostengr.javacalculator;

import java.util.Scanner;
import javax.swing.plaf.InputMapUIResource;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QDecoderStream;

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
		String selection = null;
	
		// display the main menu
		// mainMenu();
		
		// read the next line for the selection
		// i = inputText.nextLine();
		
		while (selection != "Q" || selection != "q") {
			System.out.println("");

			
			// display the main menu
			mainMenu();
			
			// read the selection from the next
			selection = inputText.nextLine();
			
			switch(selection) {
				case "1":
					CompoundInterest calculation = new CompoundInterest();
					
					System.out.println("Calculating compound interest...");
					
					System.out.println("Principal: ");
					calculation.setPrincipal(inputText.nextDouble());
					
					System.out.println("Interest Rate: ");
					calculation.setInterestRate(inputText.nextDouble());
					
					System.out.println("Compounded Per Year: ");
					calculation.setCompounded(inputText.nextInt());
					
					System.out.println("Number of Years: ");
					calculation.setYears(inputText.nextInt());
					
					calculation.calculateCompoundInterest();					
					break;
					
				case "2":
					SalesTax calcSalesTax = new SalesTax();
					
					System.out.println("Calculating sales tax...");
					
					System.out.println("Amount");
					calcSalesTax.setAmount(inputText.nextDouble());
					
					System.out.println("Tax Rate");
					calcSalesTax.setTaxRate(inputText.nextDouble());
					
					calcSalesTax.calculateSalesTax();
					break;
					
				case "3":
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
					
				case "4":
					SimpleInterest calcSimpleInterest = new SimpleInterest();
					
					System.out.println("Calculating simple interest...");
					
					System.out.println("Principal: ");
					calcSimpleInterest.setPrincipal(inputText.nextDouble());
					
					System.out.println("Interest: ");
					calcSimpleInterest.setInterestRate(inputText.nextDouble());
					
					System.out.println("Time: ");
					calcSimpleInterest.setTime(inputText.nextDouble());
					
					calcSimpleInterest.calculateSimpleInterest();
					break;
				
				case "5":
					LoanAmortization calcLoanAmortization = new LoanAmortization();
					
					System.out.println("Calculating loan amortization...");
					
					System.out.println("Principal: ");
					calcLoanAmortization.setPrincipal(inputText.nextDouble());
					
					System.out.println("Interest: ");
					calcLoanAmortization.setInterestRate(inputText.nextDouble());
					
					System.out.println("Pay Periods: ");
					calcLoanAmortization.setPayPeriods(inputText.nextInt());
					
					calcLoanAmortization.calcLoanAmortization();
					break;
				
				case "6":
					RateOfReturn calcRoR = new RateOfReturn();
					
					System.out.println("Calculating rate of return...");
					
					System.out.println("Initial value: ");
					calcRoR.setInitialValue(inputText.nextDouble());
					
					System.out.println("Final value: ");
					calcRoR.setFinalValue(inputText.nextDouble());
					
					calcRoR.calcRateOfReturn();
					break;
					
				case "7":
					Area calcArea = new Area();
					
					System.out.println("Calculating area...");
					
					System.out.println("Length: ");
					calcArea.setLength(inputText.nextDouble());
					
					System.out.println("Width: ");
					calcArea.setWidth(inputText.nextDouble());
					
					calcArea.calculateArea();
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
			
			// reset the variable
			selection = "";
		}
		
		// exit the scanner
		inputText.close();
	}

	private static void mainMenu() {
		System.out.println("MAIN MENU");
		System.out.println("--------------------------");
		System.out.println("1) Compound Interest");
		System.out.println("2) Sales Tax");
		System.out.println("3) Sales Tax with Discount");
		System.out.println("4) Simple Interest");
		System.out.println("5) Loan Amortization");
		System.out.println("6) Rate Of Return");
		System.out.println("7) Area"); 
		System.out.println("Q) Exit Calculator");
		System.out.println("");
		System.out.println("Enter your selection: ");
	}
}


