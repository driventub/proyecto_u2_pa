package com.uce.unidad2.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.repository.modelo.Ciudadano;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo{
	
	private static Logger logger =  LogManager.getLogger(CiudadanoRepoImpl.class);
	
	
	@PersistenceContext
	private EntityManager e;
	

	@Override
	public void insertar(Ciudadano ciu) {
		this.e.persist(ciu);
		
	}

}

