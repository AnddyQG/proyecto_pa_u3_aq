package com.example.demo;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class Deber11Application implements CommandLineRunner {
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IRentaService iRentaService;

	public static void main(String[] args) {
		SpringApplication.run(Deber11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// ---CREACIÓN DE VEHICULOS-----
		
		Vehiculo v1 = new Vehiculo();
		v1.setColor("negro");
		v1.setMarca("Toyota");
		v1.setModelo("corolla");
		v1.setPlaca("PUT-0023");
		Vehiculo v2 = new Vehiculo();
		v2.setColor("blanco");
		v2.setMarca("Toyota");
		v2.setModelo("Hilux");
		v2.setPlaca("RVF-0773");
		Vehiculo v3 = new Vehiculo();
		v3.setColor("negro");
		v3.setMarca("chevroleth");
		v3.setModelo("aveo");
		v3.setPlaca("TLK-2344");
		Vehiculo v4 = new Vehiculo();
		v4.setColor("blanco");
		v4.setMarca("chevroleth");
		v4.setModelo("dimax");
		v4.setPlaca("OTE-7663");
		Vehiculo v5 = new Vehiculo();
		v5.setColor("rojo");
		v5.setMarca("volfwagen");
		v5.setModelo("gol");
		v5.setPlaca("CBT-9923");
		Vehiculo v6 = new Vehiculo();
		v6.setColor("azul");
		v6.setMarca("nizzan");
		v6.setModelo("razt");
		v6.setPlaca("PFT-0863");
		
		//---CREACIÓN DE CLIENTES-----
		
		Cliente c1 = new Cliente();
		c1.setApellido("Quisilema");
		c1.setCedula("1721483814");
		c1.setEdad(23);
		c1.setNombre("Anddy");
		
		Cliente c2 = new Cliente();
		c2.setApellido("Palacios");
		c2.setCedula("3050008402");
		c2.setEdad(19);
		c2.setNombre("Juliana");
	
		
	
		
		
		//INGRESAMOS LOS DATOS A LA BASE DE DATOS
		
		this.iVehiculoService.agregar(v6);
		this.iVehiculoService.agregar(v5);
		this.iVehiculoService.agregar(v4);
		this.iVehiculoService.agregar(v3);
		this.iVehiculoService.agregar(v2);
		this.iVehiculoService.agregar(v1);
		
	
		this.clienteService.agregar(c1);
this.clienteService.agregar(c2);
        //Realizamos las rentas:
		
		
		this.iRentaService.realizar("1721483814" ,"CBT-9923");
	
		
	    
	    
        // Cliente cliOJO = this.clienteService.buscar("1721483814");

        // System.out.println(cliOJO);
	    
	    
        // Vehiculo vehiculoOJO = this.iVehiculoService.buscar("CBT-9923");

       //  System.out.println(vehiculoOJO);
         
         
        
         
      //   this.iRentaService.eliminar(2);
         
       //  this.iVehiculoService.eliminar("RVF-0773");
         
       //  Cliente cli = this.clienteService.buscar("3050008402");
         
         //cli.setApellido("Palacios");
       //  this.clienteService.actualizar(cli);
         


 


		
		
	}

}
