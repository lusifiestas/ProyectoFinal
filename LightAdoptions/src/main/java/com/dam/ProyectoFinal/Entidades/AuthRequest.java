package com.dam.ProyectoFinal.Entidades;

public class AuthRequest {
	//clase que contendra la informacion importante del usuario en cuanto a inicio de sesion se refiere
	private String correo;
	
	private String contrasenya;

	
	
	public AuthRequest() {
		super();
	}
	
	public AuthRequest(String correo, String contrasenya) {
		super();
		this.correo = correo;
		this.contrasenya = contrasenya;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	
}
