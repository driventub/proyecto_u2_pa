package com.uce.unidad2.tareas.repository.modelo;

import java.time.LocalDateTime;

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
@Table(name = "examen")
public class Examen {
	
	@Id
    @Column(name = "exam_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exam_id_seq")
    @SequenceGenerator(name = "exam_id_seq", sequenceName = "exam_id_seq", allocationSize = 1)
	private Integer id;

    @Column(name = "exam_numero")
    private String numero;

    @Column(name = "exam_fecha")
    private LocalDateTime fecha;

    @Column(name = "exam_tipo")
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "exam_paci_id")
    private Paciente paciente;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Examen [fecha=" + fecha + ", id=" + id + ", numero=" + numero + ", paciente=" +  "]";
    }

        
}
