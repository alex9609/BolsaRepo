package com.a2censo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.a2censo.app.domain.Campaign;

public interface CampaignDao extends JpaRepository<Campaign, Long> {
	//Crear los metodos para consultar en orden con sus querys
	
	@Query("select name from campaign order by amount asc")
	List<String> findAmountAsc();
	
	@Query("select name from campaign order by amount desc")
	List<String> findAmountDesc();
	
	@Query("select name from campaign order by requested_amount asc")
	List<String> findRequestedAmountAsc();
	
	@Query("select name from campaign order by requested_amount desc")
	List<String> findRequestedAmountDesc();
	
	@Query(value = "select name,amount from campaign order by amount desc",nativeQuery = true)
	List<String> findamountMayorMenor();
}
