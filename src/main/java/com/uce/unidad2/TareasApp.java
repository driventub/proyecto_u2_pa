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
import com.uce.unidad2.tareas.repository.modelo.EstudianteContarMateria;
import com.uce.unidad2.tareas.repository.modelo.EstudianteSencillo;
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
			estudiante.setNombre("Jessica");
			estudiante.setApellido("Simba");
			estudiante.setCurso("Matematica");
			estudiante.setValorMatricula(new BigDecimal("88.88"));

		// this.estudianteService.insertar(estudiante);
		
		List<EstudianteSencillo> e1 = this.estudianteService.buscarValorSencillo(new BigDecimal("51.00"));
		for (EstudianteSencillo estudianteSencillo : e1) {
			logger.info(estudianteSencillo.toString());
		}
		
		EstudianteContarMateria e2 = this.estudianteService.buscarCantidadEstudiantesSencillo("Quimica");
		logger.info(e2.toString());
		

		
	}

}
