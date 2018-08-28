package com.gvavoo.example.tempconverter.service;

import com.gvavoo.example.tempconverter.model.CelsiusToFahrenheit;
import com.gvavoo.example.tempconverter.model.CelsiusToFahrenheitResponse;
import com.gvavoo.example.tempconverter.model.ObjectFactory;
import com.gvavoo.example.tempconverter.convert.strategy.CelsiusToFahrenheitStrategy;
import com.gvavoo.example.tempconverter.convert.strategy.TemperatureConverter;
import org.springframework.stereotype.Service;

@Service
public class CelsiusToFahrenheitService {

	public CelsiusToFahrenheitResponse celsiusToFahrenheit (CelsiusToFahrenheit request) {
		CelsiusToFahrenheitResponse celsiusToFahrenheitResponse = new ObjectFactory().createCelsiusToFahrenheitResponse();
		TemperatureConverter temperatureConverter = new TemperatureConverter(new CelsiusToFahrenheitStrategy());
		celsiusToFahrenheitResponse.setCelsiusToFahrenheitResult(temperatureConverter.convert(request.getCelsius()));
		return celsiusToFahrenheitResponse;
	}
}
