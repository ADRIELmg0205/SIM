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
@SequenceGenerator(name = "seq_setor", sequenceName = "seq_setor", allocationSize = 1, initialValue = 1)
public class setor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_setor")
	@Column(name = "codset")
	private Long codigosetor;
	
	@Column(name = "nomset")
	private String nomesetor;

	public Long getCodigosetor() {
		return codigosetor;
	}

	public void setCodigosetor(Long codigosetor) {
		this.codigosetor = codigosetor;
	}

	public String getNomesetor() {
		return nomesetor;
	}

	public void setNomesetor(String nomesetor) {
		this.nomesetor = nomesetor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}


