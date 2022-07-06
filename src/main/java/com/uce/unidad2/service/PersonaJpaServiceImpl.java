package com.uce.unidad2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.repository.IPersonaJpaRepo;
import com.uce.unidad2.repository.modelo.Persona;

@Service
public class PersonaJpaServiceImpl implements IPersonaJpaService {

    @Autowired
    private IPersonaJpaRepo jpaRepo;

    @Override
    public Persona buscarId(Integer id) {
        // TODO Auto-generated method stub
        return this.jpaRepo.buscarId(id);
    }

    @Override
    public void insertar(Persona p) {
        this.jpaRepo.insertar(p);
        
    }

    @Override
    public void actualizar(Persona p) {
        this.jpaRepo.actualizar(p);
        
    }

    @Override
    public void eliminar(Integer id) {
        this.jpaRepo.eliminar(id);
        
    }

    @Override
    public Persona buscarCedula(String cedula) {
        
        return this.jpaRepo.buscarCedula(cedula);
    }

    @Override
    public List<Persona> buscarGenero(String Genero) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Persona> buscarApellido(String apellido) {
        // TODO Auto-generated method stub
        return this.jpaRepo.buscarApellido(apellido);
    }

    

   
    
}
