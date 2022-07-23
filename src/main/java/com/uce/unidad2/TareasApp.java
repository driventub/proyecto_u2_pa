package com.uce.unidad2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.tareas.repository.modelo.Examen;
import com.uce.unidad2.tareas.repository.modelo.Paciente;
import com.uce.unidad2.tareas.service.IPacienteService;

@SpringBootApplication
public class TareasApp implements CommandLineRunner{

	@Autowired
	private IPacienteService pacienteService;

	private static Logger logger =  LogManager.getLogger(TareasApp.class);

	public static void main(String[] args) {
		SpringApplication.run(TareasApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Paciente p = new Paciente();
		Examen hematica = new Examen();
		Examen hormonal = new Examen();
		Examen copro = new Examen();
		List<Examen> examenes = new ArrayList<>();

		p.setNombre("Lilith");
		p.setApellido("Amaya");
		p.setCedula("171324646-0");
		p.setEdad(46);
		p.setNumTelefono("0986732211");

		hematica.setNumero("3BH");
		hematica.setFecha(LocalDateTime.of(2022, 04, 16, 13, 00, 00));
		hematica.setTipo("Biometrica Hematica");
		
		hormonal.setNumero("3QS");
		hormonal.setFecha(LocalDateTime.of(2022, 04, 16, 14, 00, 00));
		hormonal.setTipo("Quimica Sanguinea/Hormonal");
		
		copro.setNumero("3CP");
		copro.setFecha(LocalDateTime.of(2022, 04, 16, 15, 00, 00));
		copro.setTipo("Coproparasitario");

		examenes.add(hematica);
		examenes.add(hormonal);
		examenes.add(copro);

		for (Examen examen : examenes) {
			examen.setPaciente(p);
		}

		p.setExamenes(examenes);

		// CRUD
		this.pacienteService.insertar(p);

		p.setNombre("Lilia");
		this.pacienteService.actualizar(p);

		this.pacienteService.buscar(1);

		this.pacienteService.eliminar(1);

		


		

		

		
	}

}
