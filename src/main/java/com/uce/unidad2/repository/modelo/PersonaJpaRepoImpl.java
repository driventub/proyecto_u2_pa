package com.uce.unidad2.repository.modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonaJpaRepoImpl implements IPersonaJpaRepo{

    @Autowired
    private EntityManager entityManager;

    @Override
    public Persona buscarId(Integer id) {
        // TODO Auto-generated method stub
        return this.entityManager.find(Persona.class, id);
    }

    @Override
    public void insertar(Persona p) {
        this.entityManager.persist(p);
        
    }

    @Override
    public void actualizar(Persona p) {
        this.entityManager.merge(p);
        
    }

    @Override
    public void eliminar(Integer id) {
        Persona p = buscarId(id);
        this.entityManager.remove(p);
        
    }

    @Override
    public List<Persona> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
