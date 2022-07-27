package com.uce.unidad2.cajero.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
    @Column(name = "prod_s_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_s_id_seq")
    @SequenceGenerator(name = "prod_s_id_seq", sequenceName = "prod_s_id_seq", allocationSize = 1)
	private Integer id;

    @Column(name = "prod_s_nombre")
    private String nombre;

    @Column(name = "prod_s_precio")
    private BigDecimal precio;

    @OneToMany(mappedBy = "producto")
    private List<Detalle> detalles;

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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    
}