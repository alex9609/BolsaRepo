package com.a2censo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a2censo.app.domain.Campaign;
import com.a2censo.app.service.ICampaignService;

@Controller
@RequestMapping("/app")
public class CampaignController {
	
	//Para inyectar nuestra clase service
		@Autowired
		private ICampaignService campaignService;
		
		//Mapear a un endpoint
		//Queremos recibir un parametro para hacer la consulta
		//Usamos las llaves, y el parametro tiene que coincidir con el argumento	

		//Metodos descubiertos
		@GetMapping("/criterio/{campo}/tipo/{orden}")
		public List<String> nombres(@PathVariable String campo,@PathVariable String orden){
			
			List<String> result = null;
			if(campo.equals("amount")) {
				if(orden.equals("MayorMenor")) {
					result = campaignService.findAmountDesc();
				}else if(orden.equals("MenorMayor")) {
					result = campaignService.findAmountAsc();
				}
			}
			else if(campo.equals("requestedAmount")) {
				if(orden.equals("MayorMenor")) {
					result = campaignService.findRequestedAmountDesc();
				}else if(orden.equals("MenorMayor")) {
					result = campaignService.findRequestedAmountAsc();
				}
			}
			
			return result;
		}

		@RequestMapping(value="/inicio")
		public String allCampaigns(Model model){
			 List<Campaign> listCampaign = campaignService.allCampaigns();
			 model.addAttribute("listCampaign",listCampaign);
			return "inicio";
		}
		
		@GetMapping(value="/index")
		public String index() {
			return "index";
		}
		
		
}
