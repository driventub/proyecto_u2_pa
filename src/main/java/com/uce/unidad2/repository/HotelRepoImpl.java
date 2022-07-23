package com.uce.unidad2.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.repository.modelo.onetomany.Hotel;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo{
	
	private static Logger logger =  LogManager.getLogger(HotelRepoImpl.class);
	
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public Hotel buscar(Integer id) {
		return this.e.find(Hotel.class, id);
	}

	@Override
	public List<Hotel> buscarTodos() {
		TypedQuery<Hotel> myTypedQuery = (TypedQuery<Hotel>) this.e
				.createQuery("SELECT f FROM Hotel f    ",Hotel.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(Hotel hote) {
		this.e.merge(hote);
		
	}

	@Override
	public void eliminar(Integer id) {
		Hotel gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(Hotel hote) {
		this.e.persist(hote);
		
	}

}