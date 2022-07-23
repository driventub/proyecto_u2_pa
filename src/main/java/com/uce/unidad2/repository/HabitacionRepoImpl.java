package com.uce.unidad2.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.repository.modelo.onetomany.Habitacion;

@Repository
@Transactional
public class HabitacionRepoImpl implements IHabitacionRepo{
	
	private static Logger logger =  LogManager.getLogger(HabitacionRepoImpl.class);
	
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public Habitacion buscar(Integer id) {
		return this.e.find(Habitacion.class, id);
	}

	@Override
	public List<Habitacion> buscarTodos() {
		TypedQuery<Habitacion> myTypedQuery = (TypedQuery<Habitacion>) this.e
				.createQuery("SELECT f FROM Habitacion f    ",Habitacion.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(Habitacion habi) {
		this.e.merge(habi);
		
	}

	@Override
	public void eliminar(Integer id) {
		Habitacion gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(Habitacion habi) {
		this.e.persist(habi);
		
	}

}


