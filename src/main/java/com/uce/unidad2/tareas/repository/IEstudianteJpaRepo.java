package com.uce.unidad2.tareas.repository;

import java.math.BigDecimal;
import java.util.List;

import com.uce.unidad2.tareas.repository.modelo.Estudiante;
import com.uce.unidad2.tareas.repository.modelo.EstudianteContarMateria;
import com.uce.unidad2.tareas.repository.modelo.EstudianteSencillo;

public interface IEstudianteJpaRepo {
	public Estudiante buscar(Integer id);

	public List<Estudiante> buscarTodos();

	public void actualizar(Estudiante e);

	public void eliminar(Integer id);

	public void insertar(Estudiante e);

	public List<Estudiante> buscarValorTyped(BigDecimal valor);

	public List<Estudiante> buscarValorNamed(BigDecimal valor);

	public List<Estudiante> buscarValorNative(BigDecimal valor);

	public List<Estudiante> buscarValorNativeNamed(BigDecimal valor);

	public List<Estudiante> buscarValorTypedNamed(BigDecimal valor);

	public List<Estudiante> buscarValorCriteriaAPI(BigDecimal valor);

	public Estudiante buscarEstudianteTyped(String nombre, String apellido, String curso);

	public Estudiante buscarEstudianteNamed(String nombre, String apellido, String curso);

	public Estudiante buscarEstudianteNative(String nombre, String apellido, String curso);

	public Estudiante buscarEstudianteNativeNamed(String nombre, String apellido, String curso);

	public Estudiante buscarEstudianteTypedNamed(String nombre, String apellido, String curso);

	public Estudiante buscarEstudianteCriteriaAPI(String nombre, String apellido, String curso);

	public List<EstudianteSencillo> buscarValorSencillo(BigDecimal valor);

	public EstudianteContarMateria buscarCantidadEstudiantesSencillo(String curso);

}