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
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
	@Column(name = "codpro")
	private Long codigoproduto;
	
	@Column(name = "refpro")
	private String referenciaproduto;
	
	@Column(name = "despro")
	private String descricaoproduto;

	@Column(name = "prepro")
	private Double precoproduto;
	
	@Column(name = "numpro")
	private int numeroproduto;
	
	@Column(name = "codmat")
	private int codigomateriaprimaproduto;
	
//	@ManyToOne
//	@JoinColumn(name = "codmat")
//	private materiaprima codigomateriaprimaproduto;

	public Long getCodigoproduto() {
		return codigoproduto;
	}

	public void setCodigoproduto(Long codigoproduto) {
		this.codigoproduto = codigoproduto;
	}

	public String getReferenciaproduto() {
		return referenciaproduto;
	}

	public void setReferenciaproduto(String referenciaproduto) {
		this.referenciaproduto = referenciaproduto;
	}

	public String getDescricaoproduto() {
		return descricaoproduto;
	}

	public void setDescricaoproduto(String descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}

	public Double getPrecoproduto() {
		return precoproduto;
	}

	public void setPrecoproduto(Double precoproduto) {
		this.precoproduto = precoproduto;
	}

	public int getNumeroproduto() {
		return numeroproduto;
	}

	public void setNumeroproduto(int numeroproduto) {
		this.numeroproduto = numeroproduto;
	}

//	public materiaprima getCodigomateriaprimaproduto() {
//		return codigomateriaprimaproduto;
//	}
//
//	public void setCodigomateriaprimaproduto(materiaprima codigomateriaprimaproduto) {
//		this.codigomateriaprimaproduto = codigomateriaprimaproduto;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCodigomateriaprimaproduto() {
		return codigomateriaprimaproduto;
	}

	public void setCodigomateriaprimaproduto(int codigomateriaprimaproduto) {
		this.codigomateriaprimaproduto = codigomateriaprimaproduto;
	}
	
	
}


