package com.abc.client;

import com.abc.util.IncomeTaxCalculator;

public class IncomeTaxManager {

	IncomeTaxCalculator incomeTaxCalculator;

	IncomeTaxManager(){
		incomeTaxCalculator = new IncomeTaxCalculator();
	}
	
	
	
	public static void main(String[] args) {
		IncomeTaxManager mgr = new IncomeTaxManager();	// step 1;

		float totalIncome = 300000;
		float incomeTax = mgr.incomeTaxCalculator.calculateIncomeTax(totalIncome);
		float surcharge = mgr.incomeTaxCalculator.calculateSurcharge(incomeTax);
		float totalIncomeTax = mgr.incomeTaxCalculator.getTotalTaxPayable(surcharge, incomeTax);

		System.out.println("Income tax payable for total income of " + totalIncome + " is : " + totalIncomeTax);		
		
	}

}
