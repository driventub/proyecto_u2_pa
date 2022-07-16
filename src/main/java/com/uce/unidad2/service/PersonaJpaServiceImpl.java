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
    public List<Persona> buscarGenero(String genero) {

        return this.jpaRepo.buscarGenero(genero);
    }

    @Override
    public List<Persona> buscarApellido(String apellido) {

        return this.jpaRepo.buscarApellido(apellido);
    }

    @Override
    public List<Persona> buscarNombre(String nombre) {

        return this.jpaRepo.buscarApellido(nombre);
    }

    @Override
    public Integer actualizarPorApellido(String apellido, String genero) {

        return this.jpaRepo.actualizarPorApellido(apellido, genero);
    }

    @Override
    public Integer eliminarPorGenero(String genero) {

        return this.jpaRepo.eliminarPorGenero(genero);
    }

    @Override
    public Persona buscarCedulaTyped(String cedula) {

        return this.jpaRepo.buscarCedulaTyped(cedula);
    }

    @Override
    public Persona buscarCedulaNamed(String cedula) {

        return this.jpaRepo.buscarCedulaNamed(cedula);
    }

    @Override
    public Persona buscarCedulaNative(String cedula) {

        return this.jpaRepo.buscarCedulaNative(cedula);
    }

    @Override
    public Persona buscarCedulaTypedNamed(String cedula) {

        return this.jpaRepo.buscarCedulaTypedNamed(cedula);
    }

    @Override
    public List<Persona> buscarNombreApellido(String nombre, String apellido) {

        return this.jpaRepo.buscarNombreApellido(nombre, apellido);
    }

    @Override
    public Persona buscarCedulaNamedNative(String cedula) {

        return this.jpaRepo.buscarCedulaNamedNative(cedula);
    }

    @Override
    public Persona buscarCedulaCriteriaAPI(String cedula) {

        return this.jpaRepo.buscarCedulaCriteriaAPI(cedula);
    }

    @Override
    public Persona buscarDinamica(String nombre, String apellido, String genero) {

        return this.jpaRepo.buscarDinamica(nombre, apellido, genero);
    }

    @Override
    public Persona buscarDinamicaPredicado(String nombre, String apellido, String genero) {

        return this.jpaRepo.buscarDinamicaPred(nombre, apellido, genero);
    }

}
