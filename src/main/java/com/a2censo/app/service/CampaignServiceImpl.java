package com.a2censo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.a2censo.app.domain.Campaign;
import com.a2censo.app.repository.CampaignDao;

/**
 * Clase CampaignServiceImpl, se encarga de implementar los metodos con las Queries personalizadas
 * de Campaign Dao
 * @author alexa
 *
 */
@Service
public class CampaignServiceImpl implements ICampaignService {

	// Inyectamos usando autowired

	@Autowired
	private CampaignDao campaignDao;

	// Implementar las consultas de los metodos para consultas especificas
	// Nuevos metodos descubierto

	/**
	 * Habilitada para solo lectura, implementacion para para el retorno de la consula desde CampaignDao sobre el atributo Amount
	 */
	@Transactional(readOnly = true)
	public List<String> findAmountAsc() {
		return campaignDao.findAmountAsc();
	}

	/**
	 * Habilitada para solo lectura, implementacion para para el retorno de la consula desde CampaignDao sobre el atributo Amount
	 */
	@Transactional(readOnly = true)
	public List<String> findAmountDesc() {
		return campaignDao.findAmountDesc();
	}

	/**
	 * Habilitada para solo lectura, implementacion para para el retorno de la consula desde CampaignDao sobre el atributo requested amount
	 */
	@Transactional(readOnly = true)
	public List<String> findRequestedAmountAsc() {
		return campaignDao.findRequestedAmountAsc();
	}

	/**
	 * Habilitada para solo lectura, implementacion para para el retorno de la consula desde CampaignDao sobre el atributo requested amount
	 */
	@Transactional(readOnly = true)
	public List<String> findRequestedAmountDesc() {
		return campaignDao.findRequestedAmountDesc();
	}

	/**
	 * Metodo ya implementado en el CrudRepository de JPA de spring para la consulta de todos los valores de una tabla
	 */
	@Transactional(readOnly = true)
	public List<Campaign> allCampaigns() {
		return campaignDao.findAll();
	}

}
