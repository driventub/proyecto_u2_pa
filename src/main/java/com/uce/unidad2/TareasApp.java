package com.uce.unidad2;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.tareas.repository.modelo.Autor2;
import com.uce.unidad2.tareas.repository.modelo.Libro2;
import com.uce.unidad2.tareas.repository.modelo.LibroAutor2;
import com.uce.unidad2.tareas.service.ILibroAutor2Service;

@SpringBootApplication
public class TareasApp implements CommandLineRunner{

	@Autowired
	private ILibroAutor2Service libroAutorService;

	private static Logger logger =  LogManager.getLogger(TareasApp.class);

	public static void main(String[] args) {
		SpringApplication.run(TareasApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Libro2 l1 = new Libro2();
		Libro2 l2 = new Libro2();

		Autor2 a1 = new Autor2();
		Autor2 a2 = new Autor2();

		LibroAutor2 liau = new LibroAutor2();
		LibroAutor2 liau1 = new LibroAutor2();
		
		
		

		l1.setNumPaginas(33);
		l1.setTitulo("Cenicienta");

		l2.setNumPaginas(55);
		l2.setTitulo("Principito");

		a1.setNombre("Sigmoud Freud");
		a2.setNombre("Kun Aguero");

		// Dos autores, un libro
		

		liau.setAutor2(a1);
		liau.setLibro2(l1);

		this.libroAutorService.insertar(liau);
		
		// liau.setAutor2(a1);
		// liau.setLibro2(l2);

		// this.libroAutorService.insertar(liau);

		// // Dos libros, un autor

		
		// liau1.setAutor2(a1);
		// liau1.setLibro2(l1);

		// this.libroAutorService.insertar(liau1);
		
		// liau1.setAutor2(a1);
		// liau1.setLibro2(l2);

		// this.libroAutorService.insertar(liau1);

		

		

		
	}

}
