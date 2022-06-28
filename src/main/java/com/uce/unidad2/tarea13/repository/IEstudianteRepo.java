package com.uce.unidad2.tarea13.repository;

import com.uce.unidad2.tarea13.modelo.Estudiante;

public interface IEstudianteRepo {
    public Estudiante buscarId(Integer id);

    public void insertar(Estudiante estu);

    public void actualizar(Estudiante estu);

    public void eliminar(Integer id);

}
