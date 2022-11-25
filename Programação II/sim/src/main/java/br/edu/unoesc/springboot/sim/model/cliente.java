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
@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1, initialValue = 1)
public class cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente")
	@Column(name = "codcli")
	private Long codigocliente;
	
	@ManyToOne
	@JoinColumn(name = "cpfclf")
	private String cpfclientefisico;
	
	@ManyToOne
	@JoinColumn(name = "cnpclj")
	private String cnpjclientejuridico;

	public Long getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(Long codigocliente) {
		this.codigocliente = codigocliente;
	}

	public String getCpfclientefisico() {
		return cpfclientefisico;
	}

	public void setCpfclientefisico(String cpfclientefisico) {
		this.cpfclientefisico = cpfclientefisico;
	}

	public String getCnpjclientejuridico() {
		return cnpjclientejuridico;
	}

	public void setCnpjclientejuridico(String cnpjclientejuridico) {
		this.cnpjclientejuridico = cnpjclientejuridico;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}


