package br.edu.unoesc.springboot.sim.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
* 
* @author Adriel/Gustavo
* @version 1.0
* 
*/

@Entity
public class endereco implements Serializable{
	
	@Id
	@Column(name = "cepend")
	private Long cependereco;
	
	@Column(name = "estend")
	private String estadoendereco;

	@Column(name = "cidend")
	private String cidadeendereco;
	
	@Column(name = "ruaend")
	private String ruaendereco;
	
	@Column(name = "numend")
	private int numeroendereco;
	
	@Column(name = "comend")
	private String complementoendereco;

	public Long getCependereco() {
		return cependereco;
	}

	public void setCependereco(Long cependereco) {
		this.cependereco = cependereco;
	}

	public String getEstadoendereco() {
		return estadoendereco;
	}

	public void setEstadoendereco(String estadoendereco) {
		this.estadoendereco = estadoendereco;
	}

	public String getCidadeendereco() {
		return cidadeendereco;
	}

	public void setCidadeendereco(String cidadeendereco) {
		this.cidadeendereco = cidadeendereco;
	}

	public String getRuaendereco() {
		return ruaendereco;
	}

	public void setRuaendereco(String ruaendereco) {
		this.ruaendereco = ruaendereco;
	}

	public int getNumeroendereco() {
		return numeroendereco;
	}

	public void setNumeroendereco(int numeroendereco) {
		this.numeroendereco = numeroendereco;
	}

	public String getComplementoendereco() {
		return complementoendereco;
	}

	public void setComplementoendereco(String complementoendereco) {
		this.complementoendereco = complementoendereco;
	}

}

