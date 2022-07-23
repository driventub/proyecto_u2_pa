package com.uce.unidad2.tareas.service;

import java.util.List;

import com.uce.unidad2.tareas.repository.modelo.Paciente;

public interface IPacienteService {
	public Paciente buscar(Integer id);
	public List<Paciente> buscarTodos();
	public void actualizar(Paciente paci);
	public void eliminar(Integer id);
	public void insertar(Paciente paci);
}

