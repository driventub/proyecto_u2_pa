package com.uce.unidad2.tareas.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.unidad2.tareas.repository.IExamenRepo;
import com.uce.unidad2.tareas.repository.modelo.Examen;

@Service
public class ExamenServiceImpl implements IExamenService {

    private static Logger logger = LogManager.getLogger(ExamenServiceImpl.class);

    @Autowired
    private IExamenRepo examRepo;

    @Override
    public Examen buscar(Integer id) {

        return this.examRepo.buscar(id);
    }

    @Override
    public List<Examen> buscarTodos() {

        return this.examRepo.buscarTodos();
    }

    @Override
    public void actualizar(Examen exam) {
        this.examRepo.actualizar(exam);

    }

    @Override
    public void eliminar(Integer id) {
        this.examRepo.eliminar(id);

    }

    @Override
    public void insertar(Examen exam) {
        this.examRepo.insertar(exam);

    }

}
