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
@Table(name = "libro2")
public class Libro2 {
	
	@Id
    @Column(name = "libr2_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr2_id_seq")
    @SequenceGenerator(name = "libr2_id_seq", sequenceName = "libr2_id_seq", allocationSize = 1)
	private Integer id;

    @Column(name = "libr2_titulo")
    private String titulo;

    @Column(name = "libr2_paginas")
    private Integer numPaginas;

    @OneToMany(mappedBy = "libro2")
    private List<LibroAutor2> lista;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public List<LibroAutor2> getLista() {
        return lista;
    }

    public void setLista(List<LibroAutor2> lista) {
        this.lista = lista;
    }

    

    

    


}
