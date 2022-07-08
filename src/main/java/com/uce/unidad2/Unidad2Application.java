package com.uce.unidad2;



import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.pattern.LoggerPatternConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.repository.modelo.Persona;
import com.uce.unidad2.service.IPersonaJpaService;






@SpringBootApplication
public class Unidad2Application implements CommandLineRunner{


	@Autowired
	private IPersonaJpaService personaJpaService;

	private static Logger logger =  LogManager.getLogger(Unidad2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Unidad2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Persona p = new Persona();
		// p.setId(8);
		p.setNombre("Susana");
		p.setApellido("Bolaños");
		p.setGenero("Femenino");
		p.setCedula("172036829-1");

		// Insertar
		// this.personaJpaService.insertar(p);



		// Actualizar
		// p.setNombre("Palbo");
		// p.setCedula("180426829-1");
		// this.personaJpaService.actualizar(p);

		// Eliminar
		// this.personaJpaService.eliminar(52);

		// Buscar
		// Persona pBuscado = this.personaJpaService.buscarId(6);
		// logger.info( "Dato con JPA" +pBuscado.toString());
		
		logger.info("**********************CEDULA*******************");

		Persona pBuscado = this.personaJpaService.buscarCedula("180426829-1");
		logger.info( "Dato con JPQL " +pBuscado.toString());


		logger.info("**********************APELLIDO*******************");
		List<Persona> pLista = this.personaJpaService.buscarApellido("Bolaños");

		for (Persona per : pLista) {
			logger.info(per.toString());
		}

		logger.info("**********************NOMBRE*******************");
		List<Persona> pNombre = this.personaJpaService.buscarNombre("Carlos");
		for (Persona per : pNombre) {
			logger.info(per.toString());
		}

		logger.info("**********************GENERO*******************");
		List<Persona> pGenero = this.personaJpaService.buscarGenero("Masculino");
		for (Persona per : pGenero) {
			logger.info(per.toString());
		}



	}

}
