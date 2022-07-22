package com.uce.unidad2.tareas.repository.modelo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadano_p")
public class CiudadanoP {

    @Id
    @Column(name = "ciud_p_p_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_p_id_seq")
    @SequenceGenerator(name = "ciud_p_id_seq", sequenceName = "ciud_p_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "ciud_p_nombre")
    private String nombre;

    @Column(name = "ciud_p_apellido")
    private String apellido;

    @Column(name = "ciud_p_cedula")
    private String cedula;

    @Column(name = "ciud_p_naci")
    private LocalDateTime fechaNacimiento;

    @OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)
    private Pasaporte pasaporte;

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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "CiudadanoP [apellido=" + apellido + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento
                + ", id=" + id + ", nombre=" + nombre + ", pasaporte=" + pasaporte + "]";
    }

    
}