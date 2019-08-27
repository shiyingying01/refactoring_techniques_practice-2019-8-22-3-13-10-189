package com.tws.refactoring.extract_variable;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceCalculatorTest {
	@Test
	public void sould_return_110_when_getPrice_given_quantity_and_itemPrice(){
		//given
		int quantity = 10;
		int itemPrice = 10;
		PriceCalculator  priceCalculator = new PriceCalculator();
		//when
		double price = priceCalculator.getPrice(quantity,itemPrice);
		//then
		assertEquals(110.0,0.1,price);
		
	}
}

