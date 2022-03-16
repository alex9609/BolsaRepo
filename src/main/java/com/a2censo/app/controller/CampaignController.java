package com.a2censo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a2censo.app.domain.Campaign;
import com.a2censo.app.domain.Orden;
import com.a2censo.app.service.ICampaignService;

/**
 * Clase controller para el control de los endPoint de la consulta
 * 
 * @author alexa
 *
 */
@Controller
@RequestMapping
public class CampaignController {

	// Para inyectar nuestra clase service
	@Autowired
	private ICampaignService campaignService;

	/**
	 * EndPoint principal que nos muestra el listado de las empresas en el template valor.html
	 * ruta de acceso 
	 * localhost:8080
	 * @param model Modelado de nuestra vista en la web
	 * @return nos redirige a valor.html
	 */
	@GetMapping()
	public String valor(Model model) {
		List<Campaign> listCampaign = campaignService.allCampaigns();
		model.addAttribute("listCampaign", listCampaign);
		return "valor";
	}
	
	/**
	 * EndPoint que recibe como parametro :
	 * @param orden un objeto de tipo orden que contiene:
	 * el criterio de busqueda ya sea Amount o Requested Amount
	 * el orde de busqueda ya sea Mayor a menor o de Menor a mayor
	 * 
	 * @param model odelado de nuestra vista en la web
	 * @return
	 */
	@GetMapping("/valor")
	public String index(Orden orden, Model model) {
		model.addAttribute("criterio", orden.getCriterio());
		model.addAttribute("orden", orden.getOrden());

		List<String> result = null;

		if (orden.getCriterio().equalsIgnoreCase("amount")) {
			// ordenar por menor o mayor
			if (orden.getOrden().equalsIgnoreCase("mayor")) {
				result = campaignService.findAmountDesc();
			} else if (orden.getOrden().equalsIgnoreCase("menor")) {
				result = campaignService.findAmountAsc();
			}
		} else if (orden.getCriterio().equalsIgnoreCase("requestedamount")) {
			// ordenar por menor o mayor
			if (orden.getOrden().equalsIgnoreCase("mayor")) {
				result = campaignService.findRequestedAmountDesc();
			} else if (orden.getOrden().equalsIgnoreCase("menor")) {
				result = campaignService.findRequestedAmountAsc();
			}
		}
		model.addAttribute("listNameCampaigns", result);
		return "resultado";
	}



}
