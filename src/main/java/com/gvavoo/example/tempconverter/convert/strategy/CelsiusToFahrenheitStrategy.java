package com.gvavoo.example.tempconverter.convert.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CelsiusToFahrenheitStrategy implements ConvertStrategy {

	@Override
	public String convert (String input) {
		BigDecimal celsius = new BigDecimal(input);
		return celsius
						.multiply(new BigDecimal("9"))
						.divide(new BigDecimal("5"), RoundingMode.CEILING)
						.add(new BigDecimal("32"))
						.toString();
	}
}
