package com.seguimiento.model;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	private int dni;
	private String password;
	private String apellido;
	private String correo;
	private int telefono;
	private String direccion;
	private int codigo_postal;
	private String metodo_pago;

	public Usuario() {

	}

	public Usuario(int dni, String password, String apellido, String correo, int telefono, String direccion,
			int codigo_postal, String metodo_pago) {
		super();
		this.dni = dni;
		this.password = password;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.codigo_postal = codigo_postal;
		this.metodo_pago = metodo_pago;
	}


}