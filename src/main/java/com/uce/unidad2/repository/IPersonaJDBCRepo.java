package com.uce.unidad2.repository;

import com.uce.unidad2.to.Persona;

public interface IPersonaJDBCRepo {
    public Persona buscarId(Integer id);
    public void insertar(Persona p);
    public void actualizar(Persona p);
    public void eliminar(Integer id);
}
