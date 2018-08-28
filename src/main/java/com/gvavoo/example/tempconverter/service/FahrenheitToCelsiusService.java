package com.gvavoo.example.tempconverter.service;

import com.gvavoo.example.tempconverter.model.FahrenheitToCelsius;
import com.gvavoo.example.tempconverter.model.FahrenheitToCelsiusResponse;
import com.gvavoo.example.tempconverter.model.ObjectFactory;
import com.gvavoo.example.tempconverter.convert.strategy.FahrenheitToCelsiusStrategy;
import com.gvavoo.example.tempconverter.convert.strategy.TemperatureConverter;
import org.springframework.stereotype.Service;

@Service
public class FahrenheitToCelsiusService {

	public FahrenheitToCelsiusResponse fahrenheitToCelsius (FahrenheitToCelsius request) {
		FahrenheitToCelsiusResponse fahrenheitToCelsiusResponse = new ObjectFactory().createFahrenheitToCelsiusResponse();
		TemperatureConverter temperatureConverter = new TemperatureConverter(new FahrenheitToCelsiusStrategy());
		fahrenheitToCelsiusResponse.setFahrenheitToCelsiusResult(temperatureConverter.convert(request.getFahrenheit()));
		return fahrenheitToCelsiusResponse;
	}
}
