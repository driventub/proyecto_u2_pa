package com.uce.unidad2.tarea13.modelo;

import java.math.BigDecimal;

public class Estudiante {
    
    private Integer id;

    private String nombre;

    private String apellido;

    private String curso;

    private BigDecimal valorMatricula;

    public Estudiante(Integer id, String nombre, String apellido, String curso, BigDecimal valorMatricula) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.valorMatricula = valorMatricula;
    }

    public Estudiante() {
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public BigDecimal getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(BigDecimal valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    @Override
    public String toString() {
        return "Estudiante [apellido=" + apellido + ", curso=" + curso + ", id=" + id + ", nombre=" + nombre
                + ", valorMatricula=" + valorMatricula + "]";
    }

    
    
    
}
