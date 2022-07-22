package com.uce.unidad2.tareas.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.tareas.repository.modelo.CiudadanoP;

@Repository
@Transactional
public class CiudadanoPRepoImpl implements ICiudadanoPRepo{
	
	private static Logger logger =  LogManager.getLogger(CiudadanoPRepoImpl.class);
	
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public CiudadanoP buscar(Integer id) {
		return this.e.find(CiudadanoP.class, id);
	}

	@Override
	public List<CiudadanoP> buscarTodos() {
		TypedQuery<CiudadanoP> myTypedQuery = (TypedQuery<CiudadanoP>) this.e
				.createQuery("SELECT f FROM CiudadanoP f    ",CiudadanoP.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(CiudadanoP ciu) {
		this.e.merge(ciu);
		
	}

	@Override
	public void eliminar(Integer id) {
		CiudadanoP gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(CiudadanoP ciu) {
		this.e.persist(ciu);
		
	}

}

