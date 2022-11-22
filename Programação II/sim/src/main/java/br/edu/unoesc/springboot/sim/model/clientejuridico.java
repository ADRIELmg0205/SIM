package br.edu.unoesc.springboot.sim.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class clientejuridico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cnpclj")
	private Long cnpjclientejuridico;
	
	@Column(name = "razclj")
	private String razaoclientejuridico;

	@Column(name = "telclj")
	private String telefoneclientejuridico;
	
	@Column(name = "emaclj")
	private String emailclientejuridico;
	
	@Column(name = "cepend")
	private endereco cependerecoclientejuridico;

	
}

