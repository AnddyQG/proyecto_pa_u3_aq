package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3AqApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3AqApplication.class, args);
	}

	@Autowired
	private IEstudianteService estudianteService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("Estudiante por Nombre : " + this.estudianteService.buscarNombre("Anddy"));
		System.out.println("Estudiante por Apellido : " + this.estudianteService.buscarApellido("Quisilema"));
		System.out.println("Estudiante por Genero : " + this.estudianteService.buscarGenero("M"));
		System.out.println("Estudiante por Cedula : " + this.estudianteService.buscarCedula("1721483814"));
		System.out.println("Estudiante por Ciudad : " + this.estudianteService.buscarCiudad("Quito"));
	}

}
