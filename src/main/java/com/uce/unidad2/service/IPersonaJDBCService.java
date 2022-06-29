package com.uce.unidad2.service;

import java.util.List;

import com.uce.unidad2.to.PersonaTo;

public interface IPersonaJDBCService {
    public PersonaTo buscarId(Integer id);
    public void insertar(PersonaTo p);
    public void actualizar(PersonaTo p);
    public void eliminar(Integer id);
    public List<PersonaTo> buscarTodos();
}
