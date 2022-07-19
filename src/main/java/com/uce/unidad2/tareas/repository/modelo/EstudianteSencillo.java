package com.uce.unidad2.tareas.repository.modelo;

import java.io.Serializable;
import java.math.BigDecimal;

public class EstudianteSencillo implements Serializable{

    public static final long serialVersionUID = 1L;
    
    private String apellido;
    
    private BigDecimal saldo;

    

    public EstudianteSencillo(String apellido, BigDecimal saldo) {
        this.apellido = apellido;
        this.saldo = saldo;
    }

    

    public EstudianteSencillo() {
    }

    // Get y Set

    public String getApellido() {
        return apellido;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }



    @Override
    public String toString() {
        return "EstudianteSencillo [apellido=" + apellido + ", saldo=" + saldo + "]";
    }

    
}
