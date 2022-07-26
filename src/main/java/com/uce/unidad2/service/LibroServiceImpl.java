package com.uce.unidad2.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.repository.ILibroRepo;
import com.uce.unidad2.repository.modelo.manytomany.Libro;

@Service
public class LibroServiceImpl implements ILibroService {
	
	private static Logger logger =  LogManager.getLogger(LibroServiceImpl.class);

	@Autowired
	private ILibroRepo libRepo ;
	
	@Override
	public Libro buscar(Integer id) {
		
		return this.libRepo.buscar(id);
	}

	@Override
	public List<Libro> buscarTodos() {
		
		return this.libRepo.buscarTodos();
	}

	@Override
	public void actualizar(Libro lib) {
		this.libRepo.actualizar(lib);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.libRepo.eliminar(id);
		
	}

	@Override
	public void insertar(Libro lib) {
		this.libRepo.insertar(lib);
		
	}

}

