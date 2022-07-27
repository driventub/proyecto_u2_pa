package com.uce.unidad2.cajero.repository;

import com.uce.unidad2.cajero.repository.modelo.Factura;

public interface IFacturaRepo {
    public Factura consultar(Integer id);
}
