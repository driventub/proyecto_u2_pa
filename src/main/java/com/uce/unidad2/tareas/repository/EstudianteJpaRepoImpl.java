package com.uce.unidad2.tareas.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.unidad2.tareas.repository.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteJpaRepoImpl implements IEstudianteJpaRepo {

    @PersistenceContext
    private EntityManager e;

    @Override
    public Estudiante buscar(Integer id) {
        return this.e.find(Estudiante.class, id);
    }

    @Override
    public List<Estudiante> buscarTodos() {
        return null;

    }

    @Override
    public void actualizar(Estudiante e) {
        this.e.merge(e);

    }

    @Override
    public void eliminar(Integer id) {
        Estudiante gBorrar = this.buscar(id);
        this.e.remove(gBorrar);

    }

    @Override
    public void insertar(Estudiante e) {
        this.e.persist(e);

    }

}
