package com.uce.unidad2.tareas.service;

import java.util.List;

import com.uce.unidad2.tareas.repository.modelo.Examen;

public interface IExamenService {
    public Examen buscar(Integer id);

    public List<Examen> buscarTodos();

    public void actualizar(Examen exam);

    public void eliminar(Integer id);

    public void insertar(Examen exam);
}
