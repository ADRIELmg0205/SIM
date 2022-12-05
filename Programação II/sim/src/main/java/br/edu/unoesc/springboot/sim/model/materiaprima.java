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
@SequenceGenerator(name = "seq_materiaprima", sequenceName = "seq_materiaprima", allocationSize = 1, initialValue = 1)
public class materiaprima implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_materiaprima")
	@Column(name = "codmat")
	private Long codigomateriaprima;
	
	@Column(name = "desmat")
	private String descricaomateriaprima;
	
	@Column(name = "premat")
	private Double precomateriaprima;

	public Long getCodigomateriaprima() {
		return codigomateriaprima;
	}

	public void setCodigomateriaprima(Long codigomateriaprima) {
		this.codigomateriaprima = codigomateriaprima;
	}

	public String getDescricaomateriaprima() {
		return descricaomateriaprima;
	}

	public void setDescricaomateriaprima(String descricaomateriaprima) {
		this.descricaomateriaprima = descricaomateriaprima;
	}

	public Double getPrecomateriaprima() {
		return precomateriaprima;
	}

	public void setPrecomateriaprima(Double precomateriaprima) {
		this.precomateriaprima = precomateriaprima;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}


