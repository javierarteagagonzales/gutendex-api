package com.argo.gutendex.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}