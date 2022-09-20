package com.magadiflo.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({ "com.magadiflo.commons.usuarios.models.entity" })
@SpringBootApplication
public class SbServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbServicioUsuariosApplication.class, args);
	}

}
