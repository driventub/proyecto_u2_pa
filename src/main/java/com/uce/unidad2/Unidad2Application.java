package com.uce.unidad2;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.repository.modelo.manytomany.Autor;
import com.uce.unidad2.repository.modelo.manytomany.Libro;
import com.uce.unidad2.service.ILibroService;

@SpringBootApplication
public class Unidad2Application implements CommandLineRunner {
	

	@Autowired
	private ILibroService libroService;

	private static Logger logger = LogManager.getLogger(Unidad2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Unidad2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		// Libro l1 = new Libro();
		// Autor a1 = new Autor();
		
		
		
		// Set<Autor> listaAutores = new HashSet<>();



		// l1.setTitulo("La mouche");
		// l1.setNumPaginas(333);
		

		
		// a1.setNombre("Jose Perez");
		
		// listaAutores.add(a1);
		
		// l1.setAutores(listaAutores);
	

		
		// this.libroService.insertar(l1);
		

		
	}

}
