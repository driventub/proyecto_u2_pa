package com.uce.unidad2.tareas.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.tareas.repository.modelo.LibroAutor2;

@Repository
@Transactional
public class LibroAutor2RepoImpl implements ILibroAutor2Repo{
	
	private static Logger logger =  LogManager.getLogger(LibroAutor2RepoImpl.class);
	
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public LibroAutor2 buscar(Integer id) {
		return this.e.find(LibroAutor2.class, id);
	}

	@Override
	public List<LibroAutor2> buscarTodos() {
		TypedQuery<LibroAutor2> myTypedQuery = (TypedQuery<LibroAutor2>) this.e
				.createQuery("SELECT f FROM LibroAutor2 f    ",LibroAutor2.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(LibroAutor2 liau) {
		this.e.merge(liau);
		
	}

	@Override
	public void eliminar(Integer id) {
		LibroAutor2 gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(LibroAutor2 liau) {
		this.e.persist(liau);
		
	}

}
