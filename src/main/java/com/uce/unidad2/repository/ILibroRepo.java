package com.uce.unidad2.repository;

import java.util.List;

import com.uce.unidad2.repository.modelo.manytomany.Libro;

public interface ILibroRepo {
	public Libro buscar(Integer id);
	public List<Libro> buscarTodos();
	public void actualizar(Libro lib);
	public void eliminar(Integer id);
	public void insertar(Libro lib);
}

