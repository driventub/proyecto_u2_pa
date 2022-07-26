package com.uce.unidad2.tareas.repository.modelo;

import javax.persistence.CascadeType;
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
@Table(name = "libro_autor2")
public class LibroAutor2 {

 
	@Id
    @Column(name = "liau2_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "liau2_id_seq")
    @SequenceGenerator(name = "liau2_id_seq", sequenceName = "liau2_id_seq", allocationSize = 1)
	private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "liau2_autor2_id")
    private Autor2 autor2;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "liau2_libro2_id")
    private Libro2 libro2;

    // Get y Set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Autor2 getAutor2() {
        return autor2;
    }

    public void setAutor2(Autor2 autor2) {
        this.autor2 = autor2;
    }

    public Libro2 getLibro2() {
        return libro2;
    }

    public void setLibro2(Libro2 libro2) {
        this.libro2 = libro2;
    }

    
    


}
