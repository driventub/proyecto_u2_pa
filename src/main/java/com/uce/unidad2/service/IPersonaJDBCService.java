package com.uce.unidad2.service;

import com.uce.unidad2.to.Persona;

public interface IPersonaJDBCService {
    public Persona buscarId(Integer id);
    public void insertar(Persona p);
    public void actualizar(Persona p);
    public void eliminar(Integer id);
}
