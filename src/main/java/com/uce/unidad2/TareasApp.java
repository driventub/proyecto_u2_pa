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
		
		
		// Estudiante estudiante = new Estudiante();
		// 	estudiante.setNombre("Armando");
		// 	estudiante.setApellido("Mendoza");
		// 	estudiante.setCurso("Quimica");
		// 	estudiante.setValorMatricula(new BigDecimal("80.33"));

		// this.estudianteService.insertar(estudiante);
		

		
		// List<Estudiante> lista1 = this.estudianteService.buscarValorCriteriaAPI(new BigDecimal("21"));
		// for (Estudiante e : lista1) {
		// 	logger.info(e.toString());
		// }

		
		// Estudiante e1 = this.estudianteService.buscarEstudianteCriteriaAPI("Armando", "Mendoza", "Quimica");
		// logger.info(e1.toString());
		
		

		
	}

}
