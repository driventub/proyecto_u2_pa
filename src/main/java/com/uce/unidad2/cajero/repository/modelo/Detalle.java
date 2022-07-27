package com.uce.unidad2.cajero.repository.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_s")
public class Detalle {
	
	@Id
    @Column(name = "deta_s_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deta_s_id_seq")
    @SequenceGenerator(name = "deta_s_id_seq", sequenceName = "deta_s_id_seq", allocationSize = 1)
	private Integer id;

    @Column(name = "deta_s_cantidad")
    private Integer cantidad;

    @Column(name = "deta_s_subtotal")
    private BigDecimal subtotal;

    @ManyToOne
    @JoinColumn(name = "deta_s_fact_s_id")
    private Factura factura;
    
    @ManyToOne
    @JoinColumn(name = "deta_s_prod_s_id")
    private Producto producto;

    // Get y Set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Detalle [cantidad=" + cantidad +", id=" + id + ", subtotal=" + subtotal + "]";
    }

    


}
