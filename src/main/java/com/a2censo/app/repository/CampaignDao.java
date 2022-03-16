package com.a2censo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.a2censo.app.domain.Campaign;

/**
 * Interface CampaignDao
 * Creamos sus respectivos metodos para realizar las consultas de manera personalizadas
 * 
 * @author alexa
 *
 */
public interface CampaignDao extends JpaRepository<Campaign, Long> {
	// Crear los metodos para consultar en orden con sus querys

	/**
	 * Query personalizada:
	 * 
	 * @return Retorna una lista con los  nombres de las campaign  ordenados de menor a mayor según su Amount
	 */
	@Query("select name from campaign order by amount asc")
	List<String> findAmountAsc();

	/**
	 * Query personalizada:
	 * 
	 * @return Retorna una lista con los  nombres de las campaign  ordenados de mayor a menor según su Amount
	 */
	@Query("select name from campaign order by amount desc")
	List<String> findAmountDesc();

	/**
	 * Query personalizada:
	 * 
	 * @return Retorna una lista con los  nombres de las campaign  ordenados de menor a mayor según su requested_amount
	 */
	@Query("select name from campaign order by requested_amount asc")
	List<String> findRequestedAmountAsc();
	
	/**
	 * Query personalizada:
	 * 
	 * @return Retorna una lista con los  nombres de las campaign  ordenados de mayor a menor según su requested_amount
	 */
	@Query("select name from campaign order by requested_amount desc")
	List<String> findRequestedAmountDesc();

}
