package com.uce.unidad2.tareas.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.unidad2.tareas.repository.modelo.Estudiante;
import com.uce.unidad2.tareas.repository.modelo.EstudianteContarMateria;
import com.uce.unidad2.tareas.repository.modelo.EstudianteSencillo;

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

    @Override
    public List<Estudiante> buscarValorCriteriaAPI(BigDecimal valor) {
        CriteriaBuilder myBuilder = this.e.getCriteriaBuilder();

        CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);

        Root<Estudiante> estuFrom = myQuery.from(Estudiante.class);

        Predicate eValor = myBuilder.greaterThan(estuFrom.get("valorMatricula"), valor);

        CriteriaQuery<Estudiante> eCompleta = myQuery.select(estuFrom).where(eValor);

        TypedQuery<Estudiante> estuFinal = this.e.createQuery(eCompleta);

        return estuFinal.getResultList();
    }

    @Override
    public Estudiante buscarEstudianteCriteriaAPI(String nombre, String apellido, String curso) {
        CriteriaBuilder myBuilder = this.e.getCriteriaBuilder();

        CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);

        Root<Estudiante> estuFrom = myQuery.from(Estudiante.class);

        Predicate eNombre = myBuilder.equal(estuFrom.get("nombre"), nombre);
        Predicate eApellido = myBuilder.equal(estuFrom.get("apellido"), apellido);
        Predicate eCurso = myBuilder.equal(estuFrom.get("curso"), curso);

        Predicate eAnd = myBuilder.and(eNombre, eApellido, eCurso);

        CriteriaQuery<Estudiante> eCompleta = myQuery.select(estuFrom).where(eAnd);

        TypedQuery<Estudiante> estuFinal = this.e.createQuery(eCompleta);

        return estuFinal.getSingleResult();
    }

    @Override
    public List<EstudianteSencillo> buscarValorSencillo(BigDecimal valor) {
        TypedQuery<EstudianteSencillo> mQuery = this.e.createQuery(
                "SELECT NEW com.uce.unidad2.tareas.repository.modelo.EstudianteSencillo(e.apellido, e.valorMatricula) FROM Estudiante e WHERE e.valorMatricula>= :valor ORDER BY e.valorMatricula DESC",
                EstudianteSencillo.class).setParameter("valor", valor);
        return mQuery.getResultList();
    }

    @Override
    public EstudianteContarMateria buscarCantidadEstudiantesSencillo(String curso) {
        TypedQuery<EstudianteContarMateria> mQuery = this.e.createQuery(
                "SELECT NEW com.uce.unidad2.tareas.repository.modelo.EstudianteContarMateria(e.curso, COUNT(e.curso)) FROM Estudiante e WHERE e.curso = :curso GROUP BY e.curso  ",
                EstudianteContarMateria.class).setParameter("curso", curso);
        return mQuery.getSingleResult();
    }

}
