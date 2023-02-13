package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3AqApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3AqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setApellido("Quisilema");
		estudiante1.setNombre("Anddy");
		estudiante1.setCedula("1721483814");
		estudiante1.setCiudad("Quito");
		estudiante1.setGenero("M");

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Guacollante");
		estudiante2.setNombre("Rafael");
		estudiante2.setCedula("1744448785");
		estudiante2.setCiudad("Ambato");
		estudiante2.setGenero("M");

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setApellido("Palacios");
		estudiante3.setNombre("Lorena");
		estudiante3.setCedula("305008402");
		estudiante3.setCiudad("Quito");
		estudiante3.setGenero("F");

		Estudiante estudiante4 = new Estudiante();
		estudiante4.setApellido("Pepito");
		estudiante4.setNombre("Perez");
		estudiante4.setCedula("15645");
		estudiante4.setCiudad("Tulcan");
		estudiante4.setGenero("M");

		/*
		 this.estudianteService.insertar(estudiante1);
		  this.estudianteService.insertar(estudiante2);
		 this.estudianteService.insertar(estudiante3);
		  this.estudianteService.insertar(estudiante4);
		 */
/*
		System.out.println("Busqueda de un EstudianteDTO: ");
		System.out.println(this.estudianteService.buscarPorNombreTypeQueryDTO("Anddy"));

		System.out.println("Busqueda de Estudiante por Criteria API Query:");
		System.out.println(this.estudianteService.buscarPorNombreCriteria("Anddy"));

		System.out.println("Busqueda de Estudiante por Criteria API Query con AND y OR:");
		System.out.println(this.estudianteService.buscarPorNombreCriteriaAndOr("Anddy", "Quisilema", "M"));
		System.out.println(this.estudianteService.buscarPorNombreCriteriaAndOr("Lorena", "Palacios", "F"));
*/
		
		//Join fetch es un tipo de consulta exclusivo de jkarta que nos permite traer las tablas de relaciones de tablas 
		//hijas de manera eficiente se concidera que es una alternativa al lazy y ager 
		
		
		/*
		System.out.println("Eliminar por apellido");
		System.out.println(this.estudianteService.eliminaPorApellido("Pepito"));
		*/
		
		
		/*
		
		System.out.println("Actualizar por apellido : ");
		System.out.println(this.estudianteService.actualizaPorApellido("Quisilema", "Segundo"));
		*/
		/*
		System.out.println("Eliminar por apellido");
		System.out.println(this.estudianteService.eliminaPorApellido("Guacollante"));
		
		*/
		
		System.out.println("Actualizar por apellido");
		System.out.println(this.estudianteService.actualizaPorApellido("Palacios", "Juliana"));
		
	}

}
