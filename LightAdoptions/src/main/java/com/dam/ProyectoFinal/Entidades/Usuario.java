package com.dam.ProyectoFinal.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "Usuarios")
public class Usuario {
	/*Identificador de Usuario(PK)*/
	@Id
	@NotEmpty(message = "debe especificar el correo del usuario")
	@Column(name = "correo", nullable=false)
	private String correo;
	
	/*Contraseña del usuario*/
	@NotEmpty(message = "debe especificar una contraseña")
	@Column(name = "contrasenya", nullable=false)
	private String contrasenya;
	
	/*Nombre de usuario identificativo*/
	@NotEmpty(message = "debe especificar un nombre de usuario")
	@Column(name = "nombre", nullable= false)
	private String nombre;
	
	/*Biografia que se mostrará en el perfil del usuario*/
	@Column(name = "biografia", nullable = true)//podrá ser nulo puesto que no es obligatorio tener una biografia
	private String biografia;
	
	/*Ciudad en la que vive el usuario*/
	@Column(name = "ciudad", nullable = false)//el usuario debe dar esa información para saber desde donde se adopta
	private String ciudad;
	
	/*Foto de perfil del usuario*/
	@Column(name = "foto_perfil", nullable = true)
	private String fotoPerfil;
	
	@Column(name = "tipo", nullable = false)
	private String tipo;
	
	public Usuario() {
		
	}
	
	public Usuario(@NotEmpty(message= "debe especificar un correo") String correo,
			@NotEmpty(message = "debe especificar una contraseña") String contrasenya,
			@NotEmpty(message = "debe especificar un nombre de usuario") String nombre,
			String biografia,
			@NotEmpty(message = "debe especificar la ciudad desde donde se da en adopcion") String ciudad,
			String fotoPerfil,
			@NotEmpty(message = "debe especificar el tipo de usuario") String tipo) {
		this.correo=correo;
		this.contrasenya=contrasenya;
		this.nombre=nombre;
		this.biografia=biografia;
		this.ciudad=ciudad;
		this.fotoPerfil=fotoPerfil;
		this.tipo=tipo;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public String getContrasenya() {
		return contrasenya;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getBiografia() {
		return biografia;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public String getFotoPerfil() {
		return fotoPerfil;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", contrasenya=" + contrasenya + ", nombre=" + nombre + ", biografia="
				+ biografia + ", ciudad=" + ciudad + ", tipo=" + tipo + "]";
	}
	
	
	
}
