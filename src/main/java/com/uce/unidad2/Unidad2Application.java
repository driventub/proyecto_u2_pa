package com.uce.unidad2;



import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.service.IPersonaJDBCService;
import com.uce.unidad2.to.Persona;



@SpringBootApplication
public class Unidad2Application implements CommandLineRunner{

	@Autowired
	private IPersonaJDBCService personaJDBCService;

	private static Logger logger =  LogManager.getLogger(Unidad2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Unidad2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Persona p = new Persona();
		p.setId(2);
		p.setNombre("Angelica");
		p.setApellido("Joie");

		// Insertar
		// this.personaJDBCService.insertar(p);
		
		// Actualizar
		p.setNombre("Angy");
		// this.personaJDBCService.actualizar(p);

		// Eliminar
		// this.personaJDBCService.eliminar(2);

		// Buscar
		Persona pBuscado = this.personaJDBCService.buscarId(1);
		logger.info(pBuscado.toString());

	}

}
