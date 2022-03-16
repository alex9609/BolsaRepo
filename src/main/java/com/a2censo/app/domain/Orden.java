package com.a2censo.app.domain;

/**
 * Clase orden, que nos ayudara a realizar la manipulacion de la 
 * consulta por criterio y orden a la base de datos.
 * Ejemplo: Ordenar de mayor a menor el valor amount de campaign
 * @author alexa
 *
 */
public class Orden {

	private String criterio;
	private String orden;

	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

}
