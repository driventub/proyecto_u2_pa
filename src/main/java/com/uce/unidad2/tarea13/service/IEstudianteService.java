package com.uce.unidad2.tarea13.service;

import com.uce.unidad2.tarea13.modelo.Estudiante;

public interface IEstudianteService {
    public Estudiante buscarId(Integer id);

    public void insertar(Estudiante estu);

    public void actualizar(Estudiante estu);

    public void eliminar(Integer id);

}
