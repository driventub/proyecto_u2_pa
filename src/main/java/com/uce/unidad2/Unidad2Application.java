package com.uce.unidad2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.repository.modelo.Persona;
import com.uce.unidad2.service.IPersonaJpaService;

@SpringBootApplication
public class Unidad2Application implements CommandLineRunner {

	@Autowired
	private IPersonaJpaService personaJpaService;

	private static Logger logger = LogManager.getLogger(Unidad2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Unidad2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Persona persona = new Persona();
		persona.setNombre("Daniel");
		persona.setApellido("Pozo");
		persona.setGenero("Masculino");
		persona.setCedula("123477548-3");
		
		// this.personaJpaService.insertar(persona);
		
		logger.info(this.personaJpaService.buscarCedulaNamed("123477548-3").toString());
		logger.info(this.personaJpaService.buscarCedulaNamedNative("123477548-3").toString());

	

		
	}

}
