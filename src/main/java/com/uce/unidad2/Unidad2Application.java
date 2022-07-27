package com.uce.unidad2;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.unidad2.cajero.repository.IFacturaRepo;
import com.uce.unidad2.cajero.repository.modelo.Detalle;
import com.uce.unidad2.cajero.repository.modelo.Factura;

@SpringBootApplication
public class Unidad2Application implements CommandLineRunner {
	

	@Autowired
	private IFacturaRepo facturaRepo;

	private static Logger logger = LogManager.getLogger(Unidad2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Unidad2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Factura f = this.facturaRepo.consultar(1);
		logger.info(f.getNumero());
		logger.info(f.getFecha());

		List<Detalle> lista = f.getDetalles();
		for (Detalle detalle : lista) {
			logger.info(detalle.toString());
		}


		
	}

}
