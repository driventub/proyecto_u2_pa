package com.uce.unidad2;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.repository.modelo.PersonaContadorGenero;
import com.uce.unidad2.repository.modelo.PersonaSencilla;
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
		List<PersonaSencilla> listaP = this.personaJpaService.buscarApellidoSencilla("Bolaños");

		for (PersonaSencilla p : listaP) {
			logger.info(p.toString());
		}

		List<PersonaContadorGenero> listaGenero = this.personaJpaService.contarGenero();

		for (PersonaContadorGenero p : listaGenero) {
			logger.info(p.toString());
		}

	

		
	}

}
