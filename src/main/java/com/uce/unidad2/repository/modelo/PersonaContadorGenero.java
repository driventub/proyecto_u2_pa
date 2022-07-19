package com.uce.unidad2.repository.modelo;

import java.io.Serializable;

public class PersonaContadorGenero implements Serializable{

    public static final long serialVersionUID = 1L;

    private String genero;
    private Long contador;

    
    public PersonaContadorGenero(String genero, Long contador) {
        this.genero = genero;
        this.contador = contador;
    }

    

    public PersonaContadorGenero() {
    }



    // Set y Get
    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public Long getContador() {
        return contador;
    }


    public void setContador(Long contador) {
        this.contador = contador;
    }


    @Override
    public String toString() {
        return "PersonaContadorGenero [contador=" + contador + ", genero=" + genero + "]";
    }

}
