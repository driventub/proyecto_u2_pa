package com.uce.unidad2.tareas.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.tareas.repository.modelo.Paciente;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo{
	
	private static Logger logger =  LogManager.getLogger(PacienteRepoImpl.class);
	
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public Paciente buscar(Integer id) {
		return this.e.find(Paciente.class, id);
	}

	@Override
	public List<Paciente> buscarTodos() {
		TypedQuery<Paciente> myTypedQuery = (TypedQuery<Paciente>) this.e
				.createQuery("SELECT f FROM Paciente f    ",Paciente.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(Paciente paci) {
		this.e.merge(paci);
		
	}

	@Override
	public void eliminar(Integer id) {
		Paciente gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(Paciente paci) {
		this.e.persist(paci);
		
	}

}
