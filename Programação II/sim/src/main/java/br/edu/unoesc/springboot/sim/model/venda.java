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
	private int codigoproduto ;
	
	@ManyToOne
	@JoinColumn(name = "refpro")
	private String referenciaproduto;
	

	@ManyToOne
	@JoinColumn(name = "cpfven")
	private Long cpfvendedor;
	
	@ManyToOne
	@JoinColumn(name = "codcli")
	private Long codigocliente;

	@Column(name = "datven")
	private Date datavenda;
	
	@Column(name = "vlrven")
	private Double valorvenda;

	public Long getCodigovenda() {
		return codigovenda;
	}

	public void setCodigovenda(Long codigovenda) {
		this.codigovenda = codigovenda;
	}

	public int getCodigoproduto() {
		return codigoproduto;
	}

	public void setCodigoproduto(int codigoproduto) {
		this.codigoproduto = codigoproduto;
	}

	public String getReferenciaproduto() {
		return referenciaproduto;
	}

	public void setReferenciaproduto(String referenciaproduto) {
		this.referenciaproduto = referenciaproduto;
	}

	public Long getCpfvendedor() {
		return cpfvendedor;
	}

	public void setCpfvendedor(Long cpfvendedor) {
		this.cpfvendedor = cpfvendedor;
	}

	public Long getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(Long codigocliente) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}


