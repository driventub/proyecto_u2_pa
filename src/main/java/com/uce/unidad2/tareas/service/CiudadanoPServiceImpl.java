package com.uce.unidad2.tareas.service;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.tareas.repository.ICiudadanoPRepo;
import com.uce.unidad2.tareas.repository.modelo.CiudadanoP;

@Service
public class CiudadanoPServiceImpl implements ICiudadanoPService {
	
	private static Logger logger =  LogManager.getLogger(CiudadanoPServiceImpl.class);

	@Autowired
	private ICiudadanoPRepo ciud;
	
	@Override
	public CiudadanoP buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciud.buscar(id);
	}

	@Override
	public List<CiudadanoP> buscarTodos() {
		// TODO Auto-generated method stub
		return this.ciud.buscarTodos();
	}

	@Override
	public void actualizar(CiudadanoP ciu) {
		this.ciud.actualizar(ciu);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.ciud.eliminar(id);
		
	}

	@Override
	public void insertar(CiudadanoP ciu) {
		this.ciud.insertar(ciu);
		
	}

}
