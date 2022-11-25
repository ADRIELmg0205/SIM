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
public class estoque implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "codpro")
	private produto codigoprodutoestoque;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "refpro")
	private produto referenciaprodutoestoque;
	
	@Column(name = "qtdest")
	private int quantidadeestoque;

	public produto getCodigoprodutoestoque() {
		return codigoprodutoestoque;
	}

	public void setCodigoprodutoestoque(produto codigoprodutoestoque) {
		this.codigoprodutoestoque = codigoprodutoestoque;
	}

	public produto getReferenciaprodutoestoque() {
		return referenciaprodutoestoque;
	}

	public void setReferenciaprodutoestoque(produto referenciaprodutoestoque) {
		this.referenciaprodutoestoque = referenciaprodutoestoque;
	}

	public int getQuantidadeestoque() {
		return quantidadeestoque;
	}

	public void setQuantidadeestoque(int quantidadeestoque) {
		this.quantidadeestoque = quantidadeestoque;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}


