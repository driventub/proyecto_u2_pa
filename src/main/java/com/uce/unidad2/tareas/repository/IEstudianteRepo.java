package com.uce.unidad2.tareas.repository;

import com.uce.unidad2.tareas.modelo.EstudianteJdbc;

public interface IEstudianteRepo {
    public EstudianteJdbc buscarId(Integer id);

    public void insertar(EstudianteJdbc estu);

    public void actualizar(EstudianteJdbc estu);

    public void eliminar(Integer id);

}
