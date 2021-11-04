package com.prueba.dev.backend.transportservices.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CLASIFICACION")
public class Clasificacion implements Serializable{
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descripcion;
	private String identificadorApp;
	private String estado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getIdentificadorApp() {
		return identificadorApp;
	}
	public void setIdentificadorApp(String identificadorApp) {
		this.identificadorApp = identificadorApp;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
