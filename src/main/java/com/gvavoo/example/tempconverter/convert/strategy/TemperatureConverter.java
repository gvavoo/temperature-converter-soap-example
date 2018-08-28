package com.gvavoo.example.tempconverter.convert.strategy;

public class TemperatureConverter {
	private ConvertStrategy strategy;

	public TemperatureConverter (final ConvertStrategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy (final ConvertStrategy strategy) {
		this.strategy = strategy;
	}

	public String convert (String input) {
		return strategy.convert(input);
	}
}