package com.uce.unidad2.service;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.repository.IHabitacionRepo;
import com.uce.unidad2.repository.IHotelRepo;
import com.uce.unidad2.repository.modelo.onetomany.Habitacion;
import com.uce.unidad2.repository.modelo.onetomany.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {
	
	private static Logger logger =  LogManager.getLogger(HotelServiceImpl.class);

	@Autowired
	private IHotelRepo hotel ;

	@Autowired
	private IHabitacionRepo habitacionRepo;
	
	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotel.buscar(id);
	}

	@Override
	public List<Hotel> buscarTodos() {
		// TODO Auto-generated method stub
		return this.hotel.buscarTodos();
	}

	@Override
	public void actualizar(Hotel hote) {
		this.hotel.actualizar(hote);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.hotel.eliminar(id);
		
	}

	@Override
	public void insertar(Hotel hote) {
		// List<Habitacion> habitaciones= hote.getHabitaciones();
		// hote.setHabitaciones(null);
		// this.hotel.insertar(hote);

		// String numero = hote.getNombre();
		// Hotel hotelBuscado = null;
		// for(Habitacion hItem : habitaciones){
		// 	hItem.setHotel(hotelBuscado);
		// 	this.habitacionRepo.insertar(hItem);
		// }
		this.hotel.insertar(hote);
	}

}

