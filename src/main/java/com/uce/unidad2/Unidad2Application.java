package com.uce.unidad2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		Integer cantidad = this.personaJpaService.actualizarPorApellido("Bolaños", "Femenino");
		logger.info("Cantidad de registros realizados : " + cantidad);

		Integer cantidadEliminada = this.personaJpaService.eliminarPorGenero("F");
		logger.info("Cantidad de registros eliminados : " + cantidadEliminada);

	}

}
