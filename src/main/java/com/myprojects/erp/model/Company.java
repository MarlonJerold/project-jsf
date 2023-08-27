package com.myprojects.erp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Company implements Serializable {
	
	private static final long serialversionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome_fantasia", nullable = false, length = 80)
	private String tradingName;
	
	@Column(name = "razao_social", nullable = false, length = 120)
	private String legalName;

	@Column(name = "cnpj", nullable = false, length = 18)
	private String cnpj;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_criacao")
	private Date creationDate;
	
	@ManyToOne
	@JoinColumn(name = "ramo_atividade_id", nullable = false)
	private BusinessSector businessSector;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo", nullable = false, length = 30)
	private TypeCompany typeCompany;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTradingName() {
		return tradingName;
	}

	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		legalName = legalName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		creationDate = creationDate;
	}

	public BusinessSector getBusinessSector() {
		return businessSector;
	}

	public void setBusinessSector(BusinessSector businessSector) {
		this.businessSector = businessSector;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (id != other.id)
			return false;
		return true;
	}
		
}
