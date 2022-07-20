package com.uce.unidad2.repository.modelo;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	
	@Id
    @Column(name = "empl_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empl_id_seq")
    @SequenceGenerator(name = "empl_id_seq", sequenceName = "empl_id_seq", allocationSize = 1 )
	private Integer id;

    @Column(name = "empl_iess")
    private String codigoIESS;

    @Column(name = "empl_salario")
    private BigDecimal salario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empl_id_ciudadano")    
    private Ciudadano ciudadano;

    // Get y Set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoIESS() {
        return codigoIESS;
    }

    public void setCodigoIESS(String codigoIESS) {
        this.codigoIESS = codigoIESS;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    @Override
    public String toString() {
        return "Empleado [ciudadano=" + ciudadano + ", codigoIESS=" + codigoIESS + ", id=" + id + ", salario=" + salario
                + "]";
    }

   
    
    
}