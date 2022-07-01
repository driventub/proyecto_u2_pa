package com.uce.unidad2.tareas.service;

import com.uce.unidad2.tareas.modelo.EstudianteJdbc;

public interface IEstudianteService {
    public EstudianteJdbc buscarId(Integer id);

    public void insertar(EstudianteJdbc estu);

    public void actualizar(EstudianteJdbc estu
    );

    public void eliminar(Integer id);

}
