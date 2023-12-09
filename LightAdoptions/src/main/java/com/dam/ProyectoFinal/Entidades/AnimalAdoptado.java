package com.dam.ProyectoFinal.Entidades;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "AnimalAdoptado")
public class AnimalAdoptado {
	/*Codigo del animal adoptado, el cual debe mantenerse el mismo que tenia cuando estaba en adopcion, por lo que no se autogenera*/
	@Id
	@Column(name = "codigo", nullable= false)
	@NotEmpty(message = "debe especificar el codigo del animal adoptado")
	private int codigo;
	
	/*Nombre del animal adoptado*/
	@NotEmpty(message = "debe especificar el nombre del animal adoptado")
	@Column(name = "nombre", nullable= false)
	private String nombre;
	
	/*Sexo del animal adoptado*/
	@NotEmpty(message = "debe especificar el sexo del animal adoptado")
	@Column(name = "sexo", nullable= false)
	private String sexo;
	
	/*Ciudad donde se dio en adopcion*/
	@NotEmpty(message = "debe especificar la ciudad en la que se dio en adopcion el animal")
	@Column(name = "ciudad_origen", nullable= false)
	private String ciudadOrigen;
	
	/*Ciudad donde ha sido adoptado*/
	@NotEmpty(message = "debe especificar la ciudad en la que se adopto el animal")
	@Column(name = "ciudad_adopcion", nullable= false)
	private String ciudadAdopcion;
	
	/*Fecha en la que se hizo la adopcion*/
	@NotEmpty(message = "debe especificar la fecha en la que se produjo la adopcion")
	@Column(name = "fecha_adopcion", nullable= false)
	private Date fechaAdopcion;
	
	/*Foto principal del animal*/
	@NotEmpty(message = "debe incluir la foto principal del animal")
	@Column(name = "foto_principal", nullable= false)
	private String fotoPrincipal;
	
	/*atributo relacional de relacion N:1 con usuario*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "correo_usuario",referencedColumnName = "correo", nullable = false)
	private Usuario usuario;
	

	public AnimalAdoptado() {

	}
	
	public AnimalAdoptado(@NotEmpty(message = "debe especificar el codigo del animal adoptado") int codigo,
			@NotEmpty(message = "debe especificar el nombre del animal adoptado") String nombre,
			@NotEmpty(message = "debe especificar el sexo del animal adoptado") String sexo,
			@NotEmpty(message = "debe especificar la ciudad en la que se dio en adopcion el animal") String ciudadOrigen,
			@NotEmpty(message = "debe especificar la ciudad en la que se adopto el animal") String ciudadAdopcion,
			@NotEmpty(message = "debe especificar la fecha en la que se produjo la adopcion") Date fechaAdopcion,
			@NotEmpty(message = "debe incluir la foto principal del animal") String fotoPrincipal,
			Usuario usuario) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.sexo = sexo;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadAdopcion = ciudadAdopcion;
		this.fechaAdopcion = fechaAdopcion;
		this.fotoPrincipal = fotoPrincipal;
		this.usuario=usuario;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public String getCiudadOrigen() {
		return ciudadOrigen;
	}
	
	public String getCiudadAdopcion() {
		return ciudadAdopcion;
	}
	
	public Date getFechaAdopcion() {
		return fechaAdopcion;
	}
	
	public String getFotoPrincipal() {
		return fotoPrincipal;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}
	
	public void setCiudadAdopcion(String ciudadAdopcion) {
		this.ciudadAdopcion = ciudadAdopcion;
	}
	
	public void setFechaAdopcion(Date fechaAdopcion) {
		this.fechaAdopcion = fechaAdopcion;
	}
	
	public void setFotoPrincipal(String fotoPrincipal) {
		this.fotoPrincipal = fotoPrincipal;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return "AnimalAdoptado [codigo=" + codigo + ", nombre=" + nombre + ", sexo=" + sexo + ", ciudadOrigen="
				+ ciudadOrigen + ", ciudadAdopcion=" + ciudadAdopcion + ", fechaAdopcion=" + fechaAdopcion
				+ ", usuario=" + usuario + "]";
	}
}
