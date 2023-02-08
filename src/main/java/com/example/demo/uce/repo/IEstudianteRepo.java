package com.example.demo.uce.repo;

import java.util.List;

import com.example.demo.modelo.dto.EstudianteDTO;
import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {

	
	public Estudiante buscarNombreQuery(String nombre);
	public Estudiante buscarApellidoQuery(String apellido);
	public Estudiante buscarGeneroQuery(String genero);
	public Estudiante buscarCedulaQuery(String cedula);
	
	public Estudiante buscarCiudadQuery(String ciudad);
	
	public Estudiante buscarPorNombreQueryTyped(String nombre);
	
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	
	
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNOmbreNativeQueryTypedNamed(String nombre);
	
	
	
	public List<Estudiante> buscarNombreQueryList(String nombre);
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre);
	public List<Estudiante> buscarPorNOmbreNativeQueryTypedNamedList(String nombre);
	public Estudiante buscarNombreQueList(String nombre);
	
	
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre);
}
