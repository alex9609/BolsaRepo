# BolsaRepo

Prueba técnica bolsa de valores.

Versión de Spring boot 2.6.4

Para la realización de esta prueba se utilizaron las siguientes dependencias y versiones de spring boot:

 * MySQL Driver
 * Spring web
 * Spring Boot Sev Tools
 * Spring Data JPA
 * Thymeleaf 
 * 
 * Version de la base de datos utilizada MySQL 8
 * La base de datos utilizada se encuentra en ./src/main/resources con el nombre de :
 * 
 * BolsaValoresPruebaScript
 * 
 * Nombre del de la base de datos: a2censo
 * Nombre de la tabla : campaign
 * 
 * Modificacion del nombre del atributo:
 * requestedAmount a requested_amount
 * 
 * Puerto de funcionamiento server.port:8080

Para ingresar al funcionamiento de la aplicación se debe ingresar la ulr: localhost:8080

Para poder ver el listado: 
Seleccionar el criterio de busqueda en el select ya sea por amount o requested amount
Seleccionar por orden de busquedad en el select ya sea de Menor a mayor, Mayor a menor
Oprimir el botón enviar y nos muestra la lista de empresas
