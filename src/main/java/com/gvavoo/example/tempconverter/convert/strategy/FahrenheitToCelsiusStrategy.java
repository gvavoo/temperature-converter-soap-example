package com.gvavoo.example.tempconverter.convert.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FahrenheitToCelsiusStrategy implements ConvertStrategy {

	@Override
	public String convert (String input) {
		BigDecimal fahrenheit = new BigDecimal(input);
		return fahrenheit
						.subtract(new BigDecimal("32"))
						.multiply(new BigDecimal("5"))
						.divide(new BigDecimal("9"), RoundingMode.CEILING)
						.toString();
	}
}
