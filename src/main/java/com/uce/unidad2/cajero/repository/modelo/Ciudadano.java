package com.uce.unidad2.cajero.repository.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "Ciudadano_s")
@Table(name = "ciudadano_s")
public class Ciudadano {

    @Id
    @Column(name = "ciud_s_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciuds_id_seq")
    @SequenceGenerator(name = "ciud_s_id_seq", sequenceName = "ciuds_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "ciud_s_nombre")
    private String nombre;

    @Column(name = "ciud_s_apellido")
    private String apellido;

    @OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)
    private Cliente clientes;

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

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
}
