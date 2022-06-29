package com.uce.unidad2.to;

public class PersonaTo {

    private Integer id;

    private String nombre;

    private String apellido;

    public PersonaTo(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public PersonaTo() {
    }

    // Set y Get

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        return "Persona [apellido=" + apellido + ", id=" + id + ", nombre=" + nombre + "]";
    }

}
