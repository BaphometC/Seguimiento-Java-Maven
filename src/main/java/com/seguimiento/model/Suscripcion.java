package com.seguimiento.model;

import javax.persistence.*;

@Entity
@Table(name = "suscripcion")
public class Suscripcion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String fechaInicio;
	private String duracion;
	private String ciclo;
	private String diasRecordatorio;
	private String tipoMoneda;
	private long idProveedor;
	private long idUsuario;
	private long idMes;

	public long getIdMes() {
		return idMes;
	}

	public void setIdMes(long idMes) {
		this.idMes = idMes;
	}

	public long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Suscripcion() {
		//
	}

	public Suscripcion(String fechaInicio, String duracion, String ciclo, String diasRecordatorio, String tipoMoneda,
			long idUsuario, long idProveedor, long idMes) {
		super();
		this.fechaInicio = fechaInicio;
		this.duracion = duracion;
		this.ciclo = ciclo;
		this.diasRecordatorio = diasRecordatorio;
		this.tipoMoneda = tipoMoneda;
		this.idProveedor = idProveedor;
		this.idUsuario = idUsuario;
		this.idMes = idMes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getDiasRecordatorio() {
		return diasRecordatorio;
	}

	public void setDiasRecordatorio(String diasRecordatorio) {
		this.diasRecordatorio = diasRecordatorio;
	}

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
}
