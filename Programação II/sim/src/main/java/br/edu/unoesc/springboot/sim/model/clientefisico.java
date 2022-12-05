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
public class clientefisico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cpfclf")
	private Long cpfclientefisico;
	
	@JoinColumn(name = "codcli")
	private cliente codigocliente;

	public Long getCpfclientefisico() {
		return cpfclientefisico;
	}

	public void setCpfclientefisico(Long cpfclientefisico) {
		this.cpfclientefisico = cpfclientefisico;
	}

	public cliente getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(cliente codigocliente) {
		this.codigocliente = codigocliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

