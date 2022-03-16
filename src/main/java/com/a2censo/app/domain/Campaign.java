package com.a2censo.app.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase campaign que es nuestra entidad para poder manejar los datos
 * que componen una campaign.
 * Contiene sus respetivos getters y setters
 * 
 * 
 * @author alexa
 *
 */

@Entity(name = "campaign")
@Table(name = "campaign", catalog = "a2censo", schema = "")
public class Campaign implements Serializable {


	private static final long serialVersionUID = 5324401366389459792L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcampaign;

	@Column(name = "name")
	private String name;

	@Column(name = "amount")
	private Double amount;

	@Column(name = "requested_amount")
	private Double requestedAmount;

	@Column(name = "adminRate")
	private Double adminRate;

	public Long getIdcampaign() {
		return idcampaign;
	}

	public void setIdcampaign(Long idcampaign) {
		this.idcampaign = idcampaign;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getRequestedAmount() {
		return requestedAmount;
	}

	public void setRequestedAmount(Double requestedAmount) {
		this.requestedAmount = requestedAmount;
	}

	public Double getAdminRate() {
		return adminRate;
	}

	public void setAdminRate(Double adminRate) {
		this.adminRate = adminRate;
	}

}
