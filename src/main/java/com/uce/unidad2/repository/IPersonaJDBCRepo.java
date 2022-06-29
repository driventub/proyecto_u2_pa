package com.uce.unidad2.repository;

import java.util.List;

import com.uce.unidad2.to.PersonaTo;

public interface IPersonaJDBCRepo {
    public PersonaTo buscarId(Integer id);
    public void insertar(PersonaTo p);
    public void actualizar(PersonaTo p);
    public void eliminar(Integer id);
    public List<PersonaTo> buscarTodos();
}
