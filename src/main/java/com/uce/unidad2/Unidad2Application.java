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
		

		
		Persona p1 =this.personaJpaService.buscarCedula("180336829-1");
		logger.info("QUERY: " + p1.toString());
		

		Persona p2 =this.personaJpaService.buscarCedulaTyped("180336829-1");
		logger.info("TYPED QUERY: " + p2.toString());
		

		

		Persona p3 =this.personaJpaService.buscarCedulaNamed("180426829-1");
		logger.info("NAMED QUERY: " + p3.toString());

		

		Persona p4 =this.personaJpaService.buscarCedulaTypedNamed("180426829-1");
		logger.info("TYPED NAMED QUERY: " + p4.toString());
		
		for (Persona p : this.personaJpaService.buscarNombreApellido("Daniel", "Pozo")) {
			logger.info("Varios Named Queries " + p.toString() );	
		}


		
	}

}
