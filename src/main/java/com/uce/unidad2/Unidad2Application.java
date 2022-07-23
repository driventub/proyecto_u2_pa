package com.uce.unidad2;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.repository.modelo.onetomany.Habitacion;
import com.uce.unidad2.repository.modelo.onetomany.Hotel;
import com.uce.unidad2.service.IHabitacionService;
import com.uce.unidad2.service.IHotelService;

@SpringBootApplication
public class Unidad2Application implements CommandLineRunner {
	


	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habiService;

	private static Logger logger = LogManager.getLogger(Unidad2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Unidad2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		// Hotel hotel = new Hotel();
		// Habitacion h1 = new Habitacion();
		// Habitacion h2 = new Habitacion();
		// List<Habitacion> habitaciones = new ArrayList<>();


		// hotel.setNombre("Marriot");
		// hotel.setDireccion("Amazonas y Miraflores");
		
		// h1.setNumero("11");
		// h1.setPiso("1");
		// h1.setTipo("Basement");
		// h1.setHotel(hotel);

		// h2.setNumero("11A");
		// h2.setPiso("3");
		// h2.setTipo("Basement");
		// h2.setHotel(hotel);

		// habitaciones.add(h1);
		// habitaciones.add(h2);

		// hotel.setHabitaciones(habitaciones);

		// this.hotelService.insertar(hotel);

		// this.habiService.insertar(h1);

		
		
		
	}

}
