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
public class clientejuridico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cnpclj")
	private Long cnpjclientejuridico;
	
	@Column(name = "razclj")
	private String razaoclientejuridico;
	
	@ManyToOne
	@JoinColumn(name = "codcli")
	private cliente codigocliente;

	public Long getCnpjclientejuridico() {
		return cnpjclientejuridico;
	}

	public void setCnpjclientejuridico(Long cnpjclientejuridico) {
		this.cnpjclientejuridico = cnpjclientejuridico;
	}

	public String getRazaoclientejuridico() {
		return razaoclientejuridico;
	}

	public void setRazaoclientejuridico(String razaoclientejuridico) {
		this.razaoclientejuridico = razaoclientejuridico;
	}

	public cliente getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(cliente codigocliente) {
		this.codigocliente = codigocliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

