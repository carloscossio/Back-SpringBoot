package com.misionTIC2022.grupo29.equipo8.cadena.tienda.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
public class Usuario {
	
	@Id
	private String id;
	private String password;
	private String username;
	private String nombre_completo;
	private String email;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Usuario(String password, String username, String nombre_completo, String email) {
		super();
		this.password = password;
		this.username = username;
		this.nombre_completo = nombre_completo;
		this.email = email;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNombre_completo() {
		return nombre_completo;
	}
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
