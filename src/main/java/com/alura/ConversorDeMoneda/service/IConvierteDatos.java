package com.alura.ConversorDeMoneda.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
