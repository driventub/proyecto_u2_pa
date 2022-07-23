package com.uce.unidad2;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.tareas.repository.modelo.CiudadanoP;
import com.uce.unidad2.tareas.repository.modelo.Pasaporte;
import com.uce.unidad2.tareas.service.ICiudadanoPService;

@SpringBootApplication
public class TareasApp implements CommandLineRunner{


	@Autowired
	private ICiudadanoPService ciudadanoService;

	private static Logger logger =  LogManager.getLogger(TareasApp.class);

	public static void main(String[] args) {
		SpringApplication.run(TareasApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		CiudadanoP ciudadano = new CiudadanoP();
		Pasaporte pasaporte = new Pasaporte();

		ciudadano.setNombre("Luisiana");
		ciudadano.setApellido("Montero");
		ciudadano.setCedula("170318055-6");
		ciudadano.setFechaNacimiento(LocalDateTime.of(1999, 10, 10, 01, 01, 01));

		pasaporte.setNumero(ciudadano.getCedula());
		pasaporte.setFechaEmision(LocalDateTime.now());
		pasaporte.setFechaCaducidad(LocalDateTime.of(2030, 10, 10, 01, 01, 01));
		pasaporte.setCiudadano(ciudadano);

		ciudadano.setPasaporte(pasaporte);



		// this.ciudadanoService.insertar(ciudadano);

		// CiudadanoP cBuscar = this.ciudadanoService.buscar(2);
		// logger.info(cBuscar.toString());

		// ciudadano.setNombre("Luisa");
		// this.ciudadanoService.actualizar(ciudadano);

		// this.ciudadanoService.eliminar(1);
		

		
	}

}
