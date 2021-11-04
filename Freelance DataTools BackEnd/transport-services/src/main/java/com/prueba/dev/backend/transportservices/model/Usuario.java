package com.prueba.dev.backend.transportservices.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USUARIO")
public class Usuario implements Serializable{
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String numDocumento;
	
	private String nombre;
	
	private String direccion;
	
	private int ciudadId;
	
	private String telefono;
	
	private int tipoDocClasId;
	
	private int tipoUserClasId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getCiudadId() {
		return ciudadId;
	}

	public void setCiudadId(int ciudadId) {
		this.ciudadId = ciudadId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
	public int getTipoDocClasId() {
		return tipoDocClasId;
	}

	public void setTipoDocClasId(int tipoDocClasId) {
		this.tipoDocClasId = tipoDocClasId;
	}

	public int getTipoUserClasId() {
		return tipoUserClasId;
	}

	public void setTipoUserClasId(int tipoUserClasId) {
		this.tipoUserClasId = tipoUserClasId;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
