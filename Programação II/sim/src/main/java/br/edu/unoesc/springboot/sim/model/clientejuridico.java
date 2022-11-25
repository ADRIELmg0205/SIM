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

@Entity
public class clientejuridico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cnpclj")
	private Long cnpjclientejuridico;
	
	@Column(name = "razclj")
	private String razaoclientejuridico;

	@Column(name = "telclj")
	private String telefoneclientejuridico;
	
	@Column(name = "emaclj")
	private String emailclientejuridico;
	
	@ManyToOne
	@JoinColumn(name = "cepend")
	private endereco cependerecoclientejuridico;

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

	public String getTelefoneclientejuridico() {
		return telefoneclientejuridico;
	}

	public void setTelefoneclientejuridico(String telefoneclientejuridico) {
		this.telefoneclientejuridico = telefoneclientejuridico;
	}

	public String getEmailclientejuridico() {
		return emailclientejuridico;
	}

	public void setEmailclientejuridico(String emailclientejuridico) {
		this.emailclientejuridico = emailclientejuridico;
	}

	public endereco getCependerecoclientejuridico() {
		return cependerecoclientejuridico;
	}

	public void setCependerecoclientejuridico(endereco cependerecoclientejuridico) {
		this.cependerecoclientejuridico = cependerecoclientejuridico;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

