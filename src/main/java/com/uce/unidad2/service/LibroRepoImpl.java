package com.uce.unidad2.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.repository.ILibroRepo;
import com.uce.unidad2.repository.modelo.manytomany.Libro;

@Repository
@Transactional
public class LibroRepoImpl implements ILibroRepo{
	
	private static Logger logger =  LogManager.getLogger(LibroRepoImpl.class);
	
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public Libro buscar(Integer id) {
		return this.e.find(Libro.class, id);
	}

	@Override
	public List<Libro> buscarTodos() {
		TypedQuery<Libro> myTypedQuery = (TypedQuery<Libro>) this.e
				.createQuery("SELECT f FROM Libro f    ",Libro.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(Libro lib) {
		this.e.merge(lib);
		
	}

	@Override
	public void eliminar(Integer id) {
		Libro gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(Libro lib) {
		this.e.persist(lib);
		
	}

}
