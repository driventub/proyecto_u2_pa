package com.uce.unidad2.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.repository.modelo.Persona;

@Repository
@Transactional
public class PersonaJpaRepoImpl implements IPersonaJpaRepo {

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
    public Persona buscarCedula(String cedula) {
        Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.cedula =:cedula")
        .setParameter("cedula", cedula);
        return (Persona) jpqlQuery.getSingleResult();
    }

    @Override
    public List<Persona> buscarApellido(String apellido) {
        Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.apellido =:apellido")
        .setParameter("apellido", apellido);
        return (List<Persona>) jpqlQuery.getResultList();
    }

    @Override
    public List<Persona> buscarGenero(String genero) {
        Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.genero =:genero")
        .setParameter("genero", genero);
        return (List<Persona>) jpqlQuery.getResultList();
    }

    @Override
    public List<Persona> buscarNombre(String nombre) {
        Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.nombre =:nombre")
        .setParameter("nombre", nombre);
        return (List<Persona>) jpqlQuery.getResultList();
    }

}
