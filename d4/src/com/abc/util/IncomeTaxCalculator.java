package com.abc.util;

/**
 * Class to implement income tax calculator
 * 
 * @author Chetan
 *
 */
public class IncomeTaxCalculator {

	// 3,00,000 totalIncome
	// 300000 10% = 30,000 incomeTaxPayable
	// 30,000 3% = x surcharge
	// total tax payable = incomeTaxPayable + surcharge

	public Calculator calc;

	IncomeTaxCalculator() {
		calc = new Calculator();
	}

	float calculateIncomeTax(float totalIncome) { // 3,00,000
		return calc.multiply(totalIncome, 10 / 100); // 30,000
	}

	float calculateSurcharge(float incomeTaxPayable) { // 30,000
		return calc.multiply(3 / 100, incomeTaxPayable);// 1,000
	}

	float getTotalTaxPayable(float surcharge, float incomeTaxpayable) {
		return calc.add(surcharge, incomeTaxpayable);
	}

}
