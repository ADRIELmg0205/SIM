package br.edu.unoesc.springboot.sim.model;

import java.io.Serializable;
import java.sql.Date;

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
@SequenceGenerator(name = "seq_venda", sequenceName = "seq_venda", allocationSize = 1, initialValue = 1)
public class venda implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_venda")
	@Column(name = "codven")
	private Long codigovenda;
	
	@ManyToOne
	@JoinColumn(name = "codpro")
	private produto codigoproduto ;
	
	@ManyToOne
	@JoinColumn(name = "cpfven")
	private vendedor cpfvendedor;
	
	@ManyToOne
	@JoinColumn(name = "codcli")
	private cliente codigocliente;

	@Column(name = "datven")
	private Date datavenda;
	
	@Column(name = "vlrven")
	private Double valorvenda;

	@Column(name = "qtdven")
	private int qtdvenda;

	public Long getCodigovenda() {
		return codigovenda;
	}

	public void setCodigovenda(Long codigovenda) {
		this.codigovenda = codigovenda;
	}

	public produto getCodigoproduto() {
		return codigoproduto;
	}

	public void setCodigoproduto(produto codigoproduto) {
		this.codigoproduto = codigoproduto;
	}

	public vendedor getCpfvendedor() {
		return cpfvendedor;
	}

	public void setCpfvendedor(vendedor cpfvendedor) {
		this.cpfvendedor = cpfvendedor;
	}

	public cliente getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(cliente codigocliente) {
		this.codigocliente = codigocliente;
	}

	public Date getDatavenda() {
		return datavenda;
	}

	public void setDatavenda(Date datavenda) {
		this.datavenda = datavenda;
	}

	public Double getValorvenda() {
		return valorvenda;
	}

	public void setValorvenda(Double valorvenda) {
		this.valorvenda = valorvenda;
	}

	public int getQtdvenda() {
		return qtdvenda;
	}

	public void setQtdvenda(int qtdvenda) {
		this.qtdvenda = qtdvenda;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}


