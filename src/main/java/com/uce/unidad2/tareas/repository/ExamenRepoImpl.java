package com.uce.unidad2.tareas.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.tareas.repository.modelo.Examen;

@Repository
@Transactional
public class ExamenRepoImpl implements IExamenRepo{
	
	private static Logger logger =  LogManager.getLogger(ExamenRepoImpl.class);
	
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public Examen buscar(Integer id) {
		return this.e.find(Examen.class, id);
	}

	@Override
	public List<Examen> buscarTodos() {
		TypedQuery<Examen> myTypedQuery = (TypedQuery<Examen>) this.e
				.createQuery("SELECT f FROM Examen f    ",Examen.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(Examen exam) {
		this.e.merge(exam);
		
	}

	@Override
	public void eliminar(Integer id) {
		Examen gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(Examen exam) {
		this.e.persist(exam);
		
	}

}

