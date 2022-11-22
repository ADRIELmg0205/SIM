package br.edu.unoesc.springboot.sim.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class clientefisico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cpfclf")
	private Long cpfclientefisico;
	
	@Column(name = "nomclf")
	private String nomeclientefisico;

	@Column(name = "telclf")
	private String telefoneclientefisico;
	
	@Column(name = "emaclf")
	private String emailclientefisico;
	
	@Column(name = "sexclf")
	private char sexoclientefisico;
	
	@Column(name = "idaclf")
	private int idadeclientefisico;
	
	@Column(name = "cepend")
	private endereco cependerecoclientefisico;

	public Long getCpfclientefisico() {
		return cpfclientefisico;
	}

	public void setCpfclientefisico(Long cpfclientefisico) {
		this.cpfclientefisico = cpfclientefisico;
	}

	public String getNomeclientefisico() {
		return nomeclientefisico;
	}

	public void setNomeclientefisico(String nomeclientefisico) {
		this.nomeclientefisico = nomeclientefisico;
	}

	public String getTelefoneclientefisico() {
		return telefoneclientefisico;
	}

	public void setTelefoneclientefisico(String telefoneclientefisico) {
		this.telefoneclientefisico = telefoneclientefisico;
	}

	public String getEmailclientefisico() {
		return emailclientefisico;
	}

	public void setEmailclientefisico(String emailclientefisico) {
		this.emailclientefisico = emailclientefisico;
	}

	public char getSexoclientefisico() {
		return sexoclientefisico;
	}

	public void setSexoclientefisico(char sexoclientefisico) {
		this.sexoclientefisico = sexoclientefisico;
	}

	public int getIdadeclientefisico() {
		return idadeclientefisico;
	}

	public void setIdadeclientefisico(int idadeclientefisico) {
		this.idadeclientefisico = idadeclientefisico;
	}

	public endereco getCependerecoclientefisico() {
		return cependerecoclientefisico;
	}

	public void setCependerecoclientefisico(endereco cependerecoclientefisico) {
		this.cependerecoclientefisico = cependerecoclientefisico;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

