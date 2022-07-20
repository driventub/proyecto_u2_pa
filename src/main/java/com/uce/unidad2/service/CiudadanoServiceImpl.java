package com.uce.unidad2.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.repository.ICiudadanoRepo;
import com.uce.unidad2.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {
	
	private static Logger logger =  LogManager.getLogger(CiudadanoServiceImpl.class);

	@Autowired
	private ICiudadanoRepo empl;
	

	@Override
	public void insertar(Ciudadano ciu) {
		this.empl.insertar(ciu);
		
	}

}
