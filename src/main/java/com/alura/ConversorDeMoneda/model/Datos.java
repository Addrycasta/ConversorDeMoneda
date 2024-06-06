package com.alura.ConversorDeMoneda.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Datos(
        @JsonAlias("conversion_rates") Map<String, Double> conversionRates
) {
}
