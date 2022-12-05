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
public class estoque implements Serializable{
	//private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "codpro")
	private produto codigoprodutoestoque;
	
	@Column(name = "qtdest")
	private int quantidadeestoque;

	public produto getCodigoprodutoestoque() {
		return codigoprodutoestoque;
	}

	public void setCodigoprodutoestoque(produto codigoprodutoestoque) {
		this.codigoprodutoestoque = codigoprodutoestoque;
	}

	public int getQuantidadeestoque() {
		return quantidadeestoque;
	}

	public void setQuantidadeestoque(int quantidadeestoque) {
		this.quantidadeestoque = quantidadeestoque;
	}

//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}

	
}


