package com.uce.unidad2.cajero.repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.unidad2.cajero.repository.modelo.Factura;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Factura consultar(Integer id) {
        return this.entityManager.find(Factura.class, id  );
        
    }


}
