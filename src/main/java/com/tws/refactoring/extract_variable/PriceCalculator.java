package com.tws.refactoring.extract_variable;

public class PriceCalculator {
	
	
	private double basePrice(int quantity, double itemPrice) {
		return quantity * itemPrice;
	}
	
	private double discount(int quantity, double itemPrice) {
		return Math.max(0, quantity - 500) * itemPrice * 0.05;
	}
	
	private double shippingCost(int quantity, double itemPrice) {
		return Math.min(quantity * itemPrice * 0.1, 100.0);
	}
	
	public double getPrice(int quantity, double itemPrice) {
        // Price consists of: base price - discount + shipping cost
    double actualSpending =  basePrice(quantity, itemPrice) -
                    discount(quantity, itemPrice) +
        		    shippingCost(quantity, itemPrice);
         return actualSpending;
    }
}
