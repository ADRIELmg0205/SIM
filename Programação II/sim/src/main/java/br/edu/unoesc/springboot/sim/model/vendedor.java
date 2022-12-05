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
public class vendedor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cpfven")
	private Long cpfvendedor;
	
	@Column(name = "nomven")
	private String vendedor;

	@Column(name = "telven")
	private String telefonevendedor;
	
	@Column(name = "emaven")
	private String emailvendedor;
	
	@Column(name = "sexven")
	private char sexovendedor;
	
	@Column(name = "regven")
	private String regiaovendedor;
	
	@ManyToOne
	@JoinColumn(name = "cepend")
	private endereco cependerecovendedor;

	public Long getCpfvendedor() {
		return cpfvendedor;
	}

	public void setCpfvendedor(Long cpfvendedor) {
		this.cpfvendedor = cpfvendedor;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public String getTelefonevendedor() {
		return telefonevendedor;
	}

	public void setTelefonevendedor(String telefonevendedor) {
		this.telefonevendedor = telefonevendedor;
	}

	public String getEmailvendedor() {
		return emailvendedor;
	}

	public void setEmailvendedor(String emailvendedor) {
		this.emailvendedor = emailvendedor;
	}

	public char getSexovendedor() {
		return sexovendedor;
	}

	public void setSexovendedor(char sexovendedor) {
		this.sexovendedor = sexovendedor;
	}

	public String getRegiaovendedor() {
		return regiaovendedor;
	}

	public void setRegiaovendedor(String regiaovendedor) {
		this.regiaovendedor = regiaovendedor;
	}

	public endereco getCependerecovendedor() {
		return cependerecovendedor;
	}

	public void setCependerecovendedor(endereco cependerecovendedor) {
		this.cependerecovendedor = cependerecovendedor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}

