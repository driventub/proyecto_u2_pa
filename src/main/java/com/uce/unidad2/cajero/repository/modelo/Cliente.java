package com.uce.unidad2.cajero.repository.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente_s")
public class Cliente {
	
	@Id
    @Column(name = "clie_s_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clies_id_seq")
    @SequenceGenerator(name = "clie_s_id_seq", sequenceName = "clies_id_seq", allocationSize = 1)
	private Integer id;

    @Column(name = "clie_s_num_tarjeta")
    private String numTarjeta;

    @OneToOne
    @JoinColumn(name = "clie_ciud_id")
    private Ciudadano ciudadano;

    @OneToMany(mappedBy = "cliente")
    private List<Factura> facturas;


    // Get y Set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    
}
