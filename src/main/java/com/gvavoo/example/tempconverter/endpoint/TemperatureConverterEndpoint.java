package com.gvavoo.example.tempconverter.endpoint;

import com.gvavoo.example.tempconverter.model.CelsiusToFahrenheit;
import com.gvavoo.example.tempconverter.model.CelsiusToFahrenheitResponse;
import com.gvavoo.example.tempconverter.model.FahrenheitToCelsius;
import com.gvavoo.example.tempconverter.model.FahrenheitToCelsiusResponse;
import com.gvavoo.example.tempconverter.service.CelsiusToFahrenheitService;
import com.gvavoo.example.tempconverter.service.FahrenheitToCelsiusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TemperatureConverterEndpoint {
	@Autowired
	private CelsiusToFahrenheitService celsiusToFahrenheitService;
	@Autowired
	private FahrenheitToCelsiusService fahrenheitToCelsiusService;

	@PayloadRoot(namespace = "https://www.w3schools.com/xml/", localPart = "CelsiusToFahrenheit")
	@ResponsePayload
	public CelsiusToFahrenheitResponse celsiusToFahrenheit (@RequestPayload CelsiusToFahrenheit request) {
		return celsiusToFahrenheitService.celsiusToFahrenheit(request);
	}

	@PayloadRoot(namespace = "https://www.w3schools.com/xml/", localPart = "FahrenheitToCelsius")
	@ResponsePayload
	public FahrenheitToCelsiusResponse fahrenheitToCelsius (@RequestPayload FahrenheitToCelsius request) {
		return fahrenheitToCelsiusService.fahrenheitToCelsius(request);
	}
}