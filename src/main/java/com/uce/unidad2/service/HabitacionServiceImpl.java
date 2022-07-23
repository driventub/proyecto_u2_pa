package com.uce.unidad2.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.repository.IHabitacionRepo;
import com.uce.unidad2.repository.modelo.onetomany.Habitacion;
import com.uce.unidad2.repository.modelo.onetomany.Hotel;

@Service
public class HabitacionServiceImpl implements IHabitacionService {
	
	private static Logger logger =  LogManager.getLogger(HabitacionServiceImpl.class);

	@Autowired
	private IHabitacionRepo habi;
	
	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.habi.buscar(id);
	}

	@Override
	public List<Habitacion> buscarTodos() {
		// TODO Auto-generated method stub
		return this.habi.buscarTodos();
	}

	@Override
	public void actualizar(Habitacion habi) {
		this.habi.actualizar(habi);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.habi.eliminar(id);
		
	}

	@Override
	public void insertar(Habitacion habi) {
		this.habi.insertar(habi);
		
	}

}

