package com.uce.unidad2.tarea13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.tarea13.modelo.Estudiante;
import com.uce.unidad2.tarea13.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired
    private IEstudianteRepo jdbcRepo;
    
    @Override
    public Estudiante buscarId(Integer id) {
        
        return this.jdbcRepo.buscarId(id);
    }
    
    @Override
    public void insertar(Estudiante estu) {
        this.jdbcRepo.insertar(estu);
        
    }
    
    @Override
    public void actualizar(Estudiante estu) {
        this.jdbcRepo.actualizar(estu);
        
    }
    
    @Override
    public void eliminar(Integer id) {
        this.jdbcRepo.eliminar(id);
        
    }
}
