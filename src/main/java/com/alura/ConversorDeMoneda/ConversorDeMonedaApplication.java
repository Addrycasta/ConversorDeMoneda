package com.alura.ConversorDeMoneda;

import com.alura.ConversorDeMoneda.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorDeMonedaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConversorDeMonedaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
