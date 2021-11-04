package com.prueba.dev.backend.transportservices.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_vehiculo")
public class Vehiculo implements Serializable{
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String placa;
	
	private String motor;
	
	private String chasis;
	
	private String modelo;
	
	private Date fechaMatricula;
	
	private int pasajerosSentados;
	
	private int pasajerosPie;
	
	private int pesoSeco;
	
	private int pesoBruto;
	
	private int cantidadPuertas;
	
	private String marca;
	
	private String linea;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public int getPasajerosSentados() {
		return pasajerosSentados;
	}

	public void setPasajerosSentados(int pasajerosSentados) {
		this.pasajerosSentados = pasajerosSentados;
	}

	public int getPasajerosPie() {
		return pasajerosPie;
	}

	public void setPasajerosPie(int pasajerosPie) {
		this.pasajerosPie = pasajerosPie;
	}

	public int getPesoSeco() {
		return pesoSeco;
	}

	public void setPesoSeco(int pesoSeco) {
		this.pesoSeco = pesoSeco;
	}

	public int getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(int pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

}
