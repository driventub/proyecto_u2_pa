package com.uce.unidad2.tareas.repository.modelo;

import java.io.Serializable;

public class EstudianteContarMateria implements Serializable{
    
    public static final long serialVersionUID = 1L;    

    private String curso;

    private Long cantidadEstudiantes;

    public EstudianteContarMateria(String curso, Long cantidadEstudiantes) {
        this.curso = curso;
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    

    public EstudianteContarMateria() {
    }


    // Set y Get

 


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Long getContador() {
        return cantidadEstudiantes;
    }

    public void setContador(Long cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }



    @Override
    public String toString() {
        return "EstudianteContarMateria [cantidadEstudiantes=" + cantidadEstudiantes + ", curso=" + curso + "]";
    }

    
    
}
