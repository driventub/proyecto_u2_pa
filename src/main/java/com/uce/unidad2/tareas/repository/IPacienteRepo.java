package com.uce.unidad2.tareas.repository;

import java.util.List;

import com.uce.unidad2.tareas.repository.modelo.Paciente;

public interface IPacienteRepo {
	public Paciente buscar(Integer id);
	public List<Paciente> buscarTodos();
	public void actualizar(Paciente paci);
	public void eliminar(Integer id);
	public void insertar(Paciente paci);
}