package com.uce.unidad2.tareas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.tareas.modelo.EstudianteJdbc;
import com.uce.unidad2.tareas.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired
    private IEstudianteRepo jdbcRepo;
    
    @Override
    public EstudianteJdbc buscarId(Integer id) {
        
        return this.jdbcRepo.buscarId(id);
    }
    
    @Override
    public void insertar(EstudianteJdbc estu) {
        this.jdbcRepo.insertar(estu);
        
    }
    
    @Override
    public void actualizar(EstudianteJdbc estu) {
        this.jdbcRepo.actualizar(estu);
        
    }
    
    @Override
    public void eliminar(Integer id) {
        this.jdbcRepo.eliminar(id);
        
    }
}
