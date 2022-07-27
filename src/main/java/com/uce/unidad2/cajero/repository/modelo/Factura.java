package com.uce.unidad2.cajero.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "factura_s")
public class Factura {

    @Id
    @Column(name = "fact_s_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fact_s_id_seq")
    @SequenceGenerator(name = "fact_s_id_seq", sequenceName = "fact_s_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "fact_s_numero")
    private String numero;

    @Column(name = "fact_s_fecha")
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "fact_s_clie_s_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "factura",fetch = FetchType.EAGER)
    private List<Detalle> detalles;

    // Get y Set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    

}
