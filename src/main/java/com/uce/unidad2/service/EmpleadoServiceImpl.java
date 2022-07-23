package com.uce.unidad2.service;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.repository.IEmpleadoRepo;
import com.uce.unidad2.repository.modelo.onetoone.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	
	private static Logger logger =  LogManager.getLogger(EmpleadoServiceImpl.class);

	@Autowired
	private IEmpleadoRepo empl;
	
	@Override
	public void insertar(Empleado e) {
		this.empl.insertar(e);
		
	}

}
