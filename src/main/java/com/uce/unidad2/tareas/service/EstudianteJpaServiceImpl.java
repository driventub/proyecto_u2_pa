package com.uce.unidad2.tareas.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.tareas.repository.IEstudianteJpaRepo;
import com.uce.unidad2.tareas.repository.modelo.Estudiante;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService {

    @Autowired
    private IEstudianteJpaRepo estu;

    @Override
    public Estudiante buscar(Integer id) {

        return this.estu.buscar(id);
    }

    @Override
    public List<Estudiante> buscarTodos() {

        return this.estu.buscarTodos();
    }

    @Override
    public void actualizar(Estudiante e) {
        this.estu.actualizar(e);

    }

    @Override
    public void eliminar(Integer id) {
        this.estu.eliminar(id);

    }

    @Override
    public void insertar(Estudiante e) {
        this.estu.insertar(e);

    }

    @Override
    public List<Estudiante> buscarValorTyped(BigDecimal valor) {
        // TODO Auto-generated method stub
        return this.estu.buscarValorTyped(valor);
    }

    @Override
    public List<Estudiante> buscarValorNamed(BigDecimal valor) {
        // TODO Auto-generated method stub
        return this.estu.buscarValorNamed(valor);
    }

    @Override
    public List<Estudiante> buscarValorTypedNamed(BigDecimal valor) {
        // TODO Auto-generated method stub
        return this.estu.buscarValorTypedNamed(valor);
    }

    @Override
    public Estudiante buscarEstudianteTyped(String nombre, String apellido, String curso) {
        // TODO Auto-generated method stub
        return this.estu.buscarEstudianteTyped(nombre, apellido, curso);
    }

    @Override
    public Estudiante buscarEstudianteNamed(String nombre, String apellido, String curso) {
        // TODO Auto-generated method stub
        return this.estu.buscarEstudianteNamed(nombre, apellido, curso);
    }

    @Override
    public Estudiante buscarEstudianteTypedNamed(String nombre, String apellido, String curso) {
        // TODO Auto-generated method stub
        return this.estu.buscarEstudianteTypedNamed(nombre, apellido, curso);
    }

    @Override
    public List<Estudiante> buscarValorNative(BigDecimal valor) {
        // TODO Auto-generated method stub
        return this.estu.buscarValorNative(valor);
    }

    @Override
    public List<Estudiante> buscarValorNativeNamed(BigDecimal valor) {
        // TODO Auto-generated method stub
        return this.estu.buscarValorNativeNamed(valor);
    }

    @Override
    public Estudiante buscarEstudianteNative(String nombre, String apellido, String curso) {
        // TODO Auto-generated method stub
        return this.estu.buscarEstudianteNative(nombre, apellido, curso);
    }

    @Override
    public Estudiante buscarEstudianteNativeNamed(String nombre, String apellido, String curso) {
        // TODO Auto-generated method stub
        return this.estu.buscarEstudianteNativeNamed(nombre, apellido, curso);
    }

}
