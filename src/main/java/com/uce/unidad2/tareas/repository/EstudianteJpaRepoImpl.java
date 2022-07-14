package com.uce.unidad2.tareas.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.unidad2.repository.modelo.Persona;
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
        TypedQuery<Estudiante> myTypedQuery = this.e
                .createQuery("SELECT e FROM Estudiante e ",
                        Estudiante.class);
        return myTypedQuery.getResultList();

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

    @Override
    public List<Estudiante> buscarValorTyped(BigDecimal valor) {
        TypedQuery<Estudiante> myTypedQuery = this.e
                .createQuery("SELECT e FROM Estudiante e WHERE e.valorMatricula >=:valor ORDER BY e.apellido ",
                        Estudiante.class)
                .setParameter("valor", valor);
        return myTypedQuery.getResultList();
    }

    @Override
    public List<Estudiante> buscarValorNamed(BigDecimal valor) {
        Query namedQuery = this.e
                .createNamedQuery("Estudiante.buscarValor")
                .setParameter("valor", valor);
        return (List<Estudiante>) namedQuery.getResultList();
    }

    @Override
    public List<Estudiante> buscarValorTypedNamed(BigDecimal valor) {
        TypedQuery<Estudiante> myTypedQuery = this.e
                .createNamedQuery("Estudiante.buscarValor", Estudiante.class)
                .setParameter("valor", valor);
        return myTypedQuery.getResultList();
    }

    @Override
    public Estudiante buscarEstudianteTyped(String nombre, String apellido, String curso) {
        TypedQuery<Estudiante> myTypedQuery = this.e
                .createQuery(
                        "SELECT e FROM Estudiante e WHERE e.nombre =:nombre AND e.apellido=:apellido AND e.curso=:curso",
                        Estudiante.class)
                .setParameter("curso", curso)
                .setParameter("nombre", nombre)
                .setParameter("apellido", apellido);
        return myTypedQuery.getSingleResult();
    }

    @Override
    public Estudiante buscarEstudianteNamed(String nombre, String apellido, String curso) {
        Query namedQuery = this.e
                .createNamedQuery("Estudiante.buscarEstudiante")
                .setParameter("curso", curso)
                .setParameter("nombre", nombre)
                .setParameter("apellido", apellido);
        return (Estudiante) namedQuery.getSingleResult();
    }

    @Override
    public Estudiante buscarEstudianteTypedNamed(String nombre, String apellido, String curso) {
        TypedQuery<Estudiante> myTypedQuery = this.e
                .createNamedQuery("Estudiante.buscarEstudiante", Estudiante.class)
                .setParameter("curso", curso)
                .setParameter("nombre", nombre)
                .setParameter("apellido", apellido);
        return myTypedQuery.getSingleResult();
    }

    @Override
    public List<Estudiante> buscarValorNative(BigDecimal valor) {
        Query myQuery = this.e
                .createNativeQuery(
                        "SELECT * FROM estudiante WHERE estu_val_matricula >=:valor ORDER BY estu_apellido",
                        Estudiante.class)
                .setParameter("valor", valor);
        return (List<Estudiante>) myQuery.getResultList();
    }

    @Override
    public List<Estudiante> buscarValorNativeNamed(BigDecimal valor) {
        TypedQuery<Estudiante> myQuery = this.e.createNamedQuery("Estudiante.buscarValorNative", Estudiante.class)
                .setParameter("valor", valor);
        return myQuery.getResultList();
    }

    @Override
    public Estudiante buscarEstudianteNative(String nombre, String apellido, String curso) {
        Query myQuery = this.e
                .createNativeQuery(
                        "SELECT * FROM estudiante WHERE estu_nombre =:nombre AND estu_apellido=:apellido AND estu_curso=:curso",
                        Estudiante.class)
                .setParameter("curso", curso)
                .setParameter("nombre", nombre)
                .setParameter("apellido", apellido);
        return (Estudiante) myQuery.getSingleResult();
    }

    @Override
    public Estudiante buscarEstudianteNativeNamed(String nombre, String apellido, String curso) {
        TypedQuery<Estudiante> myQuery = this.e.createNamedQuery("Estudiante.buscarEstudianteNative", Estudiante.class)
                .setParameter("curso", curso)
                .setParameter("nombre", nombre)
                .setParameter("apellido", apellido);
        return myQuery.getSingleResult();
    }

}
