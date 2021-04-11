package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controler.CalculadoraControler;

@SpringBootApplication
public class Tp1FajardoEdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1FajardoEdmApplication.class, args);
			CalculadoraControler operacion = new CalculadoraControler();
			operacion.resolverOperaciones();
			
	}

}
