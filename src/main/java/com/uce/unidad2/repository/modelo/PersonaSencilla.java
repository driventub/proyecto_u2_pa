package com.uce.unidad2.repository.modelo;

import java.io.Serializable;

public class PersonaSencilla implements Serializable{
    
    public static final long serialVersionUID = 1L;

    private String nombre;
    
    private String apellido;

    public PersonaSencilla(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public PersonaSencilla() {
    }

    // Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaSencilla [apellido=" + apellido + ", nombre=" + nombre + "]";
    }

    
    
    
}
