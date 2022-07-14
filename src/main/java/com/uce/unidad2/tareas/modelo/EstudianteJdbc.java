package com.uce.unidad2.tareas.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



public class EstudianteJdbc {
   
    private Integer id;

   
    private String nombre;

    
    private String apellido;

    
    private String curso;

    
    private BigDecimal valorMatricula;

    

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
