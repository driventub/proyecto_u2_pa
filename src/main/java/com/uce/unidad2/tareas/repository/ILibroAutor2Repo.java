package com.uce.unidad2.tareas.repository;

import java.util.List;

import com.uce.unidad2.tareas.repository.modelo.LibroAutor2;

public interface ILibroAutor2Repo {
	public LibroAutor2 buscar(Integer id);
	public List<LibroAutor2> buscarTodos();
	public void actualizar(LibroAutor2 liau);
	public void eliminar(Integer id);
	public void insertar(LibroAutor2 liau);
}