package com.uce.unidad2.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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
    public Persona buscarCedulaTyped(String cedula) {
        TypedQuery<Persona> myTypedQuery = this.entityManager
                .createQuery("SELECT p FROM Persona p WHERE p.cedula =:cedula", Persona.class)
                .setParameter("cedula", cedula);
        return myTypedQuery.getSingleResult();

    }

    @Override
    public Persona buscarCedulaNamed(String cedula) {
        Query myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula")
                .setParameter("cedula", cedula);
        return (Persona) myQuery.getSingleResult();
    }

    @Override
    public Persona buscarCedulaTypedNamed(String cedula) {
        TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula", Persona.class)
                .setParameter("cedula", cedula);
        return myQuery.getSingleResult();
    }

    @Override
    public Persona buscarCedulaNative(String cedula) {
        Query myQuery = this.entityManager
                .createNativeQuery("SELECT * FROM persona WHERE pers_cedula = :cedula", Persona.class)
                .setParameter("cedula", cedula);
        return (Persona) myQuery.getSingleResult();
    }

    @Override
    public Persona buscarCedulaNamedNative(String cedula) {
        TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarCedulaNative", Persona.class)
                .setParameter("cedula", cedula);
        return myQuery.getSingleResult();
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

    @Override
    public List<Persona> buscarNombreApellido(String nombre, String apellido) {
        TypedQuery<Persona> myQuery = this.entityManager
                .createNamedQuery("Persona.buscarPorNombreApellido", Persona.class)
                .setParameter("nombre", nombre)
                .setParameter("apellido", apellido);
        return myQuery.getResultList();
    }

    @Override
    public Integer actualizarPorApellido(String apellido, String genero) {

        Query jpqlQuery = this.entityManager
                .createQuery("UPDATE Persona p SET p.genero =:genero  WHERE p.apellido =:apellido")
                .setParameter("genero", genero)
                .setParameter("apellido", apellido);
        return jpqlQuery.executeUpdate();

    }

    @Override
    public Integer eliminarPorGenero(String genero) {
        Query jpqlQuery = this.entityManager.createQuery("DELETE Persona p WHERE p.genero =:genero ")
                .setParameter("genero", genero);

        return jpqlQuery.executeUpdate();
    }

    @Override
    public Persona buscarCedulaCriteriaAPI(String cedula) {
        CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery<Persona> myQuery = myBuilder.createQuery(Persona.class);
        Root<Persona> personaRoot = myQuery.from(Persona.class);
        TypedQuery<Persona> myQueryFinal = this.entityManager
                .createQuery(myQuery.select(personaRoot).where(myBuilder.equal(personaRoot.get("cedula"), cedula)));
        return myQueryFinal.getSingleResult();
    }

}
