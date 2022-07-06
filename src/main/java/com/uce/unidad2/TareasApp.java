package com.uce.unidad2;

import java.math.BigDecimal;

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
		
        // Estudiante e = new Estudiante();
		// e.setId(1);
		// e.setNombre("Valeria");
		// e.setApellido("Botas");
		// e.setCurso("Algebra Lineal I");
		// e.setValorMatricula(new BigDecimal("20.05"));

		// // insertar
		// this.estudianteService.insertar(e);

		// // actualizar
		// e.setCurso("Algebra Lineal II");
		// this.estudianteService.actualizar(e);

		// // buscar
		// Estudiante estu =this.estudianteService.buscar(1);
		// logger.info(estu.toString());

		// // eliminar
		// this.estudianteService.eliminar(1);
		



	}

}
