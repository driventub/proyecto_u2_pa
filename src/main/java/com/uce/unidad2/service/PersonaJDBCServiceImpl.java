package com.uce.unidad2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.repository.IPersonaJDBCRepo;
import com.uce.unidad2.to.PersonaTo;

@Service
public class PersonaJDBCServiceImpl implements IPersonaJDBCService{

    @Autowired
    private IPersonaJDBCRepo jdbcRepo;

    @Override
    public PersonaTo buscarId(Integer id) {
        // TODO Auto-generated method stub
        return this.jdbcRepo.buscarId(id);
    }

    @Override
    public void insertar(PersonaTo p) {
        this.jdbcRepo.insertar(p);
        
    }

    @Override
    public void actualizar(PersonaTo p) {
        this.jdbcRepo.actualizar(p);
        
    }

    @Override
    public void eliminar(Integer id) {
        this.jdbcRepo.eliminar(id);
        
    }

    @Override
    public List<PersonaTo> buscarTodos() {
       
        return this.jdbcRepo.buscarTodos();
    }
    
}
