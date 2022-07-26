package com.uce.unidad2.service;

import java.util.List;

import com.uce.unidad2.repository.modelo.manytomany.Libro;

public interface ILibroService {
	public Libro buscar(Integer id);
	public List<Libro> buscarTodos();
	public void actualizar(Libro lib);
	public void eliminar(Integer id);
	public void insertar(Libro lib);
}
