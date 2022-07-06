package com.uce.unidad2.repository;

import java.util.List;

import com.uce.unidad2.repository.modelo.Persona;

public interface IPersonaJpaRepo {
    public List<Persona> buscarGenero(String Genero);

    public List<Persona> buscarApellido(String apellido);

    public Persona buscarId(Integer id);

    public void insertar(Persona p);

    public void actualizar(Persona p);

    public void eliminar(Integer id);

    public Persona buscarCedula(String cedula);

}
