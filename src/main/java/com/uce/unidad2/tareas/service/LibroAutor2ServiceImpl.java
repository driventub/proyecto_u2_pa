package com.uce.unidad2.tareas.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.tareas.repository.ILibroAutor2Repo;
import com.uce.unidad2.tareas.repository.modelo.LibroAutor2;

@Service
public class LibroAutor2ServiceImpl implements ILibroAutor2Service {
	
	private static Logger logger =  LogManager.getLogger(LibroAutor2ServiceImpl.class);

	@Autowired
	private ILibroAutor2Repo liauRepo ;
	
	@Override
	public LibroAutor2 buscar(Integer id) {
		
		return this.liauRepo.buscar(id);
	}

	@Override
	public List<LibroAutor2> buscarTodos() {
		
		return this.liauRepo.buscarTodos();
	}

	@Override
	public void actualizar(LibroAutor2 liau) {
		this.liauRepo.actualizar(liau);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.liauRepo.eliminar(id);
		
	}

	@Override
	public void insertar(LibroAutor2 liau) {
		this.liauRepo.insertar(liau);
		
	}

}

