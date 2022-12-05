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
public class funcionario implements Serializable{
	
	@Id
	@Column(name = "cpffun")
	private Long cpffuncionario;
	
	@Column(name = "nomfun")
	private String nomefuncionario;

	@Column(name = "telfun")
	private String telefonefuncionario;
	
	@Column(name = "emafun")
	private String emailfuncionario;
	
	@Column(name = "sexfun")
	private char sexofuncionario;
	
	@Column(name = "senfun")
	private String senhafuncionario;
	
	@Column(name = "salfun")
	private Double salariofuncionario;
	
	@ManyToOne
	@JoinColumn(name = "codset")
	private setor codigosetorfuncionario;
	
	@ManyToOne
	@JoinColumn(name = "cepend")
	private endereco cependerecofuncionario;

	public Long getCpffuncionario() {
		return cpffuncionario;
	}

	public void setCpffuncionario(Long cpffuncionario) {
		this.cpffuncionario = cpffuncionario;
	}

	public String getNomefuncionario() {
		return nomefuncionario;
	}

	public void setNomefuncionario(String nomefuncionario) {
		this.nomefuncionario = nomefuncionario;
	}

	public String getTelefonefuncionario() {
		return telefonefuncionario;
	}

	public void setTelefonefuncionario(String telefonefuncionario) {
		this.telefonefuncionario = telefonefuncionario;
	}

	public String getEmailfuncionario() {
		return emailfuncionario;
	}

	public void setEmailfuncionario(String emailfuncionario) {
		this.emailfuncionario = emailfuncionario;
	}

	public char getSexofuncionario() {
		return sexofuncionario;
	}

	public void setSexofuncionario(char sexofuncionario) {
		this.sexofuncionario = sexofuncionario;
	}

	public String getSenhafuncionario() {
		return senhafuncionario;
	}

	public void setSenhafuncionario(String senhafuncionario) {
		this.senhafuncionario = senhafuncionario;
	}

	public Double getSalariofuncionario() {
		return salariofuncionario;
	}

	public void setSalariofuncionario(Double salariofuncionario) {
		this.salariofuncionario = salariofuncionario;
	}

	public setor getCodigosetorfuncionario() {
		return codigosetorfuncionario;
	}

	public void setCodigosetorfuncionario(setor codigosetorfuncionario) {
		this.codigosetorfuncionario = codigosetorfuncionario;
	}

	public endereco getCependerecofuncionario() {
		return cependerecofuncionario;
	}

	public void setCependerecofuncionario(endereco cependerecofuncionario) {
		this.cependerecofuncionario = cependerecofuncionario;
	}
}

