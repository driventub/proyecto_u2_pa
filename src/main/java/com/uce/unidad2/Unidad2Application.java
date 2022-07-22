package com.uce.unidad2;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.repository.modelo.Ciudadano;
import com.uce.unidad2.repository.modelo.Empleado;
import com.uce.unidad2.service.ICiudadanoService;
import com.uce.unidad2.service.IPersonaJpaService;

@SpringBootApplication
public class Unidad2Application implements CommandLineRunner {
	


	@Autowired
	private ICiudadanoService ciudadanoService;

	private static Logger logger = LogManager.getLogger(Unidad2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Unidad2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	
		// Ciudadano ciudadano = new Ciudadano();

		// ciudadano.setApellido("Haas");
		// ciudadano.setNombre("Gabriela");

		// Empleado emp = new Empleado();
		
		// emp.setCodigoIESS("7827183");
		// emp.setSalario(new BigDecimal("4000.22"));
		// emp.setCiudadano(ciudadano);

		// ciudadano.setEmpleado(emp);

		// this.ciudadanoService.insertar(ciudadano);
		
	}

}
