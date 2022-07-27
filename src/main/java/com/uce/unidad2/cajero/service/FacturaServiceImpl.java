package com.uce.unidad2.cajero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.cajero.repository.IFacturaRepo;
import com.uce.unidad2.cajero.repository.modelo.Factura;

@Service
public class  FacturaServiceImpl implements IFacturaService{

    @Autowired
    private IFacturaRepo facturaRepo;

    @Override
    public Factura consultar(Integer id) {
        
        return this.facturaRepo.consultar(id);
    }
    
}
