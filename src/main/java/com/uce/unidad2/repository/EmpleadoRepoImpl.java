package com.uce.unidad2.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.repository.modelo.onetoone.Empleado;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo{
	
	private static Logger logger =  LogManager.getLogger(EmpleadoRepoImpl.class);
	
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertar(Empleado e) {
		this.e.persist(e);
		
	}

}
