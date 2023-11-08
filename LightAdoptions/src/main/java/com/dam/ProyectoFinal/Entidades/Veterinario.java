package com.dam.ProyectoFinal.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "Veterinario")
public class Veterinario {
	/*Identificador de Veterinario(PK)*/
	@Id
	@NotEmpty(message = "debe especificar el correo del veterinario")
	@Column(name = "correo", nullable=false)
	private String correo;

	/*Ciudad donde se situa el veterinario*/
	@NotEmpty(message = "debe especificar la ciudad en la que se encuentra el veterinario")
	@Column(name = "ciudad", nullable= false)
	private String ciudad;
	
	/*Telefono de contacto del veterinario*/
	@NotEmpty(message = "debe especificar el numero de telefono de contacto con el veterinario")
	@Column(name = "telefono", nullable= false)
	private int telefono;
	
	/*Calle y numero donde está el veterinario*/
	@NotEmpty(message = "debe especificar la direccion donde se situa el veterinario")
	@Column(name = "direccion", nullable= false)
	private String direccion;
	
	/*Nombre del veterinario*/
	@NotEmpty(message = "debe especificar el nombre del veterinario")
	@Column(name = "nombre", nullable= false)
	private String nombre;
	
	public Veterinario() {
		
	}
	
	public Veterinario(@NotEmpty(message = "debe especificar la ciudad en la que se encuentra el veterinario") String ciudad,
			@NotEmpty(message = "debe especificar el numero de telefono de contacto con el veterinario") int telefono,
			@NotEmpty(message = "debe especificar el correo de contacto con el veterinario") String correo,
			@NotEmpty(message = "debe especificar la direccion donde se situa el veterinario") String direccion,
			@NotEmpty(message = "debe especificar el nombre del veterinario") String nombre) {
		
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.nombre = nombre;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Veterinario [ciudad=" + ciudad + ", telefono=" + telefono + ", correo=" + correo
				+ ", direccion=" + direccion + ", nombre=" + nombre + "]";
	}
	     
}
