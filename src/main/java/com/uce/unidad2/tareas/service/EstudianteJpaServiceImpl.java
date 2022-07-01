package com.uce.unidad2.tareas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.tareas.repository.IEstudianteJpaRepo;
import com.uce.unidad2.tareas.repository.modelo.Estudiante;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService {

    @Autowired
    private IEstudianteJpaRepo estu;

    @Override
    public Estudiante buscar(Integer id) {

        return this.estu.buscar(id);
    }

    @Override
    public List<Estudiante> buscarTodos() {

        return this.estu.buscarTodos();
    }

    @Override
    public void actualizar(Estudiante e) {
        this.estu.actualizar(e);

    }

    @Override
    public void eliminar(Integer id) {
        this.estu.eliminar(id);

    }

    @Override
    public void insertar(Estudiante e) {
        this.estu.insertar(e);

    }

}
