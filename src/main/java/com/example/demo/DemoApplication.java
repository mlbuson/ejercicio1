package com.example.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tarjetas.Operacion;
import tarjetas.Persona;
import tarjetas.Tarjeta;
import tarjetas.TarjetaService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Override
	public void run(String... args){
		Tarjeta tarjeta = new Tarjeta("visa","007","james bond",2024,5,12);

		Persona personaOperador = new Persona();
		personaOperador.setNombre("NombreOperador");
		personaOperador.setApellido("ApellidoOperador");

		Operacion operacion = new Operacion();
		operacion.setImporte(800); // Establece el importe según tus necesidades
		operacion.setOperador(personaOperador);

		TarjetaService tarjetaService = new TarjetaService();

		try {
			System.out.println(tarjeta.obtenerInformacion());
			System.out.println("Operación válida: " + operacion.esOperacionValida());
			System.out.println("Tarjeta válida para operar: " + tarjetaService.esTarjetaValida(tarjeta));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}