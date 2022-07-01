package com.uce.unidad2.tareas.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")

public class EstudianteJdbc {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "curso")
    private String curso;

    @Column(name = "valor_matricula")
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
