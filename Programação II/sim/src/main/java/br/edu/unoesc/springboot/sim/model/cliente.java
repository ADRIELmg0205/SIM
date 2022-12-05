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
@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1, initialValue = 1)
public class cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente")
	@Column(name = "codcli")
	private Long codigocliente;
	
	@Column(name = "nomclf")
	private String nomecliente;

	@Column(name = "telclf")
	private String telefonecliente;
	
	@Column(name = "emaclf")
	private String emailcliente;
	
	@Column(name = "sexclf")
	private char sexocliente;
	
	@Column(name = "idaclf")
	private int idadecliente;
	
	@Column(name = "cependcli")
	private Long cependerecocliente;
	
//	@ManyToOne
//	@JoinColumn(name = "cepend")
//	private endereco cependerecocliente;

	public Long getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(Long codigocliente) {
		this.codigocliente = codigocliente;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getTelefonecliente() {
		return telefonecliente;
	}

	public void setTelefonecliente(String telefonecliente) {
		this.telefonecliente = telefonecliente;
	}

	public String getEmailcliente() {
		return emailcliente;
	}

	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}

	public char getSexocliente() {
		return sexocliente;
	}

	public void setSexocliente(char sexocliente) {
		this.sexocliente = sexocliente;
	}

	public int getIdadecliente() {
		return idadecliente;
	}

	public void setIdadecliente(int idadecliente) {
		this.idadecliente = idadecliente;
	}

//	public endereco getCependerecocliente() {
//		return cependerecocliente;
//	}
//
//	public void setCependerecocliente(endereco cependerecocliente) {
//		this.cependerecocliente = cependerecocliente;
//	}

	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCependerecocliente() {
		return cependerecocliente;
	}

	public void setCependerecocliente(Long cependerecocliente) {
		this.cependerecocliente = cependerecocliente;
	}

	
}


