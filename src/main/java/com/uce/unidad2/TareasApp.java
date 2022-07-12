package com.uce.unidad2;

import java.math.BigDecimal;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.tareas.repository.modelo.Estudiante;
import com.uce.unidad2.tareas.service.IEstudianteJpaService;

@SpringBootApplication
public class TareasApp implements CommandLineRunner{


	@Autowired
	private IEstudianteJpaService estudianteService;

	private static Logger logger =  LogManager.getLogger(TareasApp.class);

	public static void main(String[] args) {
		SpringApplication.run(TareasApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Estudiante estudiante = new Estudiante();
			estudiante.setNombre("Pablo");
			estudiante.setApellido("Rodriguez");
			estudiante.setCurso("Fisica");
			estudiante.setValorMatricula(new BigDecimal("30.00"));

		// this.estudianteService.insertar(estudiante);
		

		logger.info("1");
		List<Estudiante> lista1 = this.estudianteService.buscarValorTyped(new BigDecimal("21"));
		for (Estudiante e : lista1) {
			logger.info(e.toString());
		}

		logger.info("2");
		List<Estudiante> lista2 = this.estudianteService.buscarValorNamed(new BigDecimal("21"));
		for (Estudiante e : lista2) {
			logger.info(e.toString());
		}

		logger.info("3");
		List<Estudiante> lista3 = this.estudianteService.buscarValorTypedNamed(new BigDecimal("21"));
		for (Estudiante e : lista3) {
			logger.info(e.toString());
		}

		logger.info("4");
		Estudiante estu1 = this.estudianteService.buscarEstudianteTyped("Pablo", "Rodriguez", "Matematica");
		logger.info(estu1.toString());
		
		logger.info("5");
		Estudiante estu2 = this.estudianteService.buscarEstudianteTyped("Pablo", "Rodriguez", "Matematica");
		logger.info(estu2.toString());

		logger.info("6");
		Estudiante estu3 = this.estudianteService.buscarEstudianteTyped("Pablo", "Rodriguez", "Matematica");
		logger.info(estu3.toString());
		 
	}

}
