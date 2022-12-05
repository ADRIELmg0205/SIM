package br.edu.unoesc.springboot.sim.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
* 
* @author Adriel/Gustavo
* @version 1.0
* 
*/

@Entity
public class fornecedor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cnpfor")
	private Long cnpjfornecedor;
	
	@Column(name = "nomfor")
	private String nomefornecedor;

	@Column(name = "telfor")
	private String telefonefornecedor;
	
	@Column(name = "emafor")
	private String emailfornecedor;
	
	@ManyToOne
	@JoinColumn(name = "codmat")
	private materiaprima codigomateriaprimafornecedor;
	
	@ManyToOne
	@JoinColumn(name = "cepend")
	private endereco cependerecofornecedor;

	public Long getCnpjfornecedor() {
		return cnpjfornecedor;
	}

	public void setCnpjfornecedor(Long cnpjfornecedor) {
		this.cnpjfornecedor = cnpjfornecedor;
	}

	public String getNomefornecedor() {
		return nomefornecedor;
	}

	public void setNomefornecedor(String nomefornecedor) {
		this.nomefornecedor = nomefornecedor;
	}

	public String getTelefonefornecedor() {
		return telefonefornecedor;
	}

	public void setTelefonefornecedor(String telefonefornecedor) {
		this.telefonefornecedor = telefonefornecedor;
	}

	public String getEmailfornecedor() {
		return emailfornecedor;
	}

	public void setEmailfornecedor(String emailfornecedor) {
		this.emailfornecedor = emailfornecedor;
	}

	public materiaprima getCodigomateriaprimafornecedor() {
		return codigomateriaprimafornecedor;
	}

	public void setCodigomateriaprimafornecedor(materiaprima codigomateriaprimafornecedor) {
		this.codigomateriaprimafornecedor = codigomateriaprimafornecedor;
	}

	public endereco getCependerecofornecedor() {
		return cependerecofornecedor;
	}

	public void setCependerecofornecedor(endereco cependerecofornecedor) {
		this.cependerecofornecedor = cependerecofornecedor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}

