package com.example.demo.springaplicacionweb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_springaplicacionweb")
public class springaplicacionweb {

	@Id
	private Integer idspringaplicacionweb;
	
	@Column(name = "nombres")
	private String nombres;

	public Integer getIdspringaplicacionweb() {
		return idspringaplicacionweb;
	}

	public void setIdspringaplicacionweb(Integer idspringaplicacionweb) {
		this.idspringaplicacionweb = idspringaplicacionweb;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	
}
