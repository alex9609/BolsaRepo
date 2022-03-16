package com.a2censo.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Aplicacion Api Rest desarrollada en spring boot para la consulta 
 * de las empresas en la tabla as2censo 
 * 
 * Spring boot version 2.6.4
 * 
 * Dependencias instaladas:
 * 
 * MySQL Driver
 * Spring web
 * Spring Boot Sev Tools
 * Spring Data JPA
 * Thymeleaf 
 * 
 * Version de la base de datos utilizada MySQL 8
 * La base de datos utilizada se encuentra en resources con el nombre de :
 * 
 * BolsaValoresPruebaScript
 * 
 * Nombre del Script de la base de datos: a2censo
 * Nombre de la tabla : campaign
 * 
 * Modificacion del nombre del atributo:
 * requestedAmount a requested_amount
 * 
 * Puerto de funcionamiento server.port:8080
 * 
 * 
 * 
 * @author alexa
 *
 */
@SpringBootApplication
public class PruebaBolsaValoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaBolsaValoresApplication.class, args);
	}

}
