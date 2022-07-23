package com.uce.unidad2.tareas.repository.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @Column(name = "paci_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paci_id_seq")
    @SequenceGenerator(name = "paci_id_seq", sequenceName = "paci_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "paci_nombre")
    private String nombre;

    @Column(name = "paci_apellido")
    private String apellido;

    @Column(name = "paci_edad")
    private Integer edad;

    @Column(name = "paci_num_telefono")
    private String numTelefono;

    @Column(name = "paci_cedula")
    private String cedula;

    @OneToMany(mappedBy = "paciente" , cascade = CascadeType.ALL)
    private List<Examen> examenes;

    // Get y Set

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public List<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Examen> examenes) {
        this.examenes = examenes;
    }

    @Override
    public String toString() {
        return "Paciente [apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad + ", examenes=" + examenes
                + ", id=" + id + ", nombre=" + nombre + ", numTelefono=" + numTelefono + "]";
    }

    
    
}