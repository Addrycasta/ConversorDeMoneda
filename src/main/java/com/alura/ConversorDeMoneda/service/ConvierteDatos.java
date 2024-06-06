package com.alura.ConversorDeMoneda.service;

import com.alura.ConversorDeMoneda.model.Datos;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public Datos obtenerDatos(String json) {
        try {
            return objectMapper.readValue(json, Datos.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
