package com.a2censo.app.service;

import java.util.List;

import com.a2censo.app.domain.Campaign;

/**
 * Interfaz service para poder implementar sus metodos en la clase CampaignServiceImpl
 * 
 * @author alexa
 *
 */
public interface ICampaignService {

	public List<String> findAmountAsc();

	public List<String> findAmountDesc();

	public List<String> findRequestedAmountAsc();

	public List<String> findRequestedAmountDesc();

	public List<Campaign> allCampaigns();

}
