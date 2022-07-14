package com.uce.unidad2.tareas.repository.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@NamedQuery(name = "Estudiante.buscarValor", query = "SELECT e FROM Estudiante e WHERE e.valorMatricula >=:valor ORDER BY e.apellido ")
@NamedQuery(name = "Estudiante.buscarEstudiante", query = "SELECT e FROM Estudiante e WHERE e.nombre =:nombre AND e.apellido=:apellido AND e.curso=:curso")
@NamedNativeQueries({
        @NamedNativeQuery(name = "Estudiante.buscarValorNative", query = "SELECT * FROM estudiante WHERE estu_val_matricula >=:valor ORDER BY estu_apellido",resultClass = Estudiante.class),
        @NamedNativeQuery(name = "Estudiante.buscarEstudianteNative", query = "SELECT * FROM estudiante WHERE estu_nombre =:nombre AND estu_apellido=:apellido AND estu_curso=:curso", resultClass =Estudiante.class) })

public class Estudiante {
    @Id
    @Column(name = "estu_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_id_seq")
    @SequenceGenerator(name = "estu_id_seq", sequenceName = "estu_id_seq")
    private Integer id;

    @Column(name = "estu_nombre")
    private String nombre;

    @Column(name = "estu_apellido")
    private String apellido;

    @Column(name = "estu_curso")
    private String curso;

    @Column(name = "estu_val_matricula")
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
