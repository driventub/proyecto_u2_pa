package com.uce.unidad2.repository;

import java.util.List;

import com.uce.unidad2.repository.modelo.Persona;

public interface IPersonaJpaRepo {
    public List<Persona> buscarGenero(String genero);

    public List<Persona> buscarApellido(String apellido);

    public List<Persona> buscarNombre(String nombre);

    public List<Persona> buscarNombreApellido(String nombre, String apellido);

    public Persona buscarId(Integer id);

    public void insertar(Persona p);

    public void actualizar(Persona p);

    public void eliminar(Integer id);

    public Persona buscarCedula(String cedula);

    public Persona buscarCedulaTyped(String cedula);

    public Persona buscarCedulaTypedNamed(String cedula);

    public Persona buscarCedulaNamed(String cedula);
    
    
    public Persona buscarCedulaNative(String cedula);

    public Persona buscarCedulaNamedNative(String cedula);

    public Persona buscarCedulaCriteriaAPI(String cedula);

    public Integer actualizarPorApellido(String apellido, String genero);

    public Integer eliminarPorGenero(String genero);

}
