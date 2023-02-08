package com.example.demo.uce.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.dto.EstudianteDTO;
import com.example.demo.uce.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		Query jpqlQuery= this.entityManager.
				createQuery("select e from Estudiante e where e.nombre = :datoNombre");
	jpqlQuery.setParameter("datoNombre", nombre);
	return (Estudiante) jpqlQuery.getSingleResult();
	
	
	}

	@Override
	public Estudiante buscarApellidoQuery(String apellido) {
		Query jpqlQuery= this.entityManager.
				createQuery("select e from Estudiante e where e.apellido= :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
	return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarGeneroQuery(String genero) {
		Query jpqlQuery= this.entityManager.
				createQuery("select e from Estudiante e where e.genero= :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
	return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarCedulaQuery(String cedula) {
		Query jpqlQuery= this.entityManager.
				createQuery("select e from Estudiante e where e.cedula= :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
	return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarCiudadQuery(String ciudad) {
		Query jpqlQuery= this.entityManager.
				createQuery("select e from Estudiante e where e.ciudad= :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
	return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery=this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre",Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorApe");
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante)myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		
		TypedQuery<Estudiante> myQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorApe", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery=this.entityManager.createNativeQuery("select * from estudiante where estu_nombre = :datoNombre",Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		
		return (Estudiante)myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNOmbreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorNomNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
		
	}

	@Override
	public List<Estudiante> buscarNombreQueryList(String nombre) {
		// TODO Auto-generated method stub
		Query jpQuery=this.entityManager.
				createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpQuery.setParameter("datoNombre", nombre);
		
		return jpQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarPorNOmbreNativeQueryTypedNamedList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante buscarNombreQueList(String nombre) {
		// TODO Auto-generated method stub
		Query jpQuery=this.entityManager.
				createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpQuery.setParameter("datoNombre", nombre);
		
		return (Estudiante) jpQuery.getResultList().get(0);
	}

	@Override
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre) {
		// TODO Auto-generated method stub
		
		TypedQuery<EstudianteDTO> myTypedQuery=this.entityManager.createQuery("select NEW EstudianteDTO(e.nombre,e.apellido,e.cedula) from Estudiante e where e.nombre = :datoNombre",EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	
	}
}
