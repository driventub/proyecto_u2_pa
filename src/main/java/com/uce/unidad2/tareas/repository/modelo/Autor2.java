package com.uce.unidad2.tareas.repository.modelo;

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
@Table(name = "autor2")
public class Autor2 {
	
	@Id
    @Column(name = "autr2_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autr2_id_seq")
    @SequenceGenerator(name = "autr2_id_seq", sequenceName = "autr2_id_seq", allocationSize = 1)
	private Integer id;

    @Column(name = "autr2_nombre")
    private String nombre;


    @OneToMany(mappedBy = "autor2"  )
    private List<LibroAutor2> lista;


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



    
}
