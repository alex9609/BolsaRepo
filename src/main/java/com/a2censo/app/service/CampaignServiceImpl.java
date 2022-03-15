package com.a2censo.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.a2censo.app.domain.Campaign;
import com.a2censo.app.repository.CampaignDao;

@Service
public class CampaignServiceImpl implements ICampaignService {
	
	//Inyectamos usando autowired
	
		@Autowired
		private CampaignDao campaignDao;

		//Implementar las consultas de los metodos para consultas especificas
		//Nuevos metodos descubierto
		
		@Transactional(readOnly = true)
		public List<String> findAmountAsc() {
			return campaignDao.findAmountAsc();
		}

		@Transactional(readOnly = true)
		public List<String> findAmountDesc() {
			return campaignDao.findAmountDesc();
		}
		
		@Transactional(readOnly = true)
		public List<String> findRequestedAmountAsc() {
			return campaignDao.findRequestedAmountAsc();
		}

		@Transactional(readOnly = true)
		public List<String> findRequestedAmountDesc() {
			return campaignDao.findRequestedAmountDesc();
		}
		
		@Transactional(readOnly = true)
		public List<Campaign> allCampaigns() {
			return campaignDao.findAll();
		}



}
