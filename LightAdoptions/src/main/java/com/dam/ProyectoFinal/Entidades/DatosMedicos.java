package com.dam.ProyectoFinal.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "DatosMedicos")
public class DatosMedicos {
	/*Clave primaria de la tabla de datos medicos(PK)*/
	@Id
	@Column(name = "codigo", nullable= false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	
	/*Indica si el animal esta vacunado o no*/
	@NotEmpty(message = "debe especificar si el animal esta vacunado o no")
	@Column(name = "vacunado", nullable= false)
	private String vacunado;
	
	/*Indica si el animal esta sano o no*/
	@NotEmpty(message = "debe especificar si el animal esta sano")
	@Column(name = "sano", nullable= false)
	private String sano;
	
	/*Indica si el animal tiene microchip o no*/
	@NotEmpty(message = "debe especificar si el animal tiene microchip o no")
	@Column(name = "microchip", nullable= false)
	private String microchip;
	
	/*Indica si el animal está desparasitado o no*/
	@NotEmpty(message = "debe especificar si el animal esta desparasitado o no")
	@Column(name = "desparasitado", nullable= false)
	private String desparasitado;
	
	/*Indica si el animal esta esterilizado o no*/
	@NotEmpty(message = "debe especificar si el animal esta esterilizado o no")
	@Column(name = "esterilizado", nullable= false)
	private String esterilizado;
	
	public DatosMedicos(@NotEmpty(message = "debe especificar si el animal esta vacunado o no") String vacunado,
			@NotEmpty(message = "debe especificar si el animal esta sano") String sano,
			@NotEmpty(message = "debe especificar si el animal tiene microchip o no") String microchip,
			@NotEmpty(message = "debe especificar si el animal esta desparasitado o no") String desparasitado,
			@NotEmpty(message = "debe especificar si el animal esta esterilizado o no") String esterilizado) {
		
		this.vacunado = vacunado;
		this.sano = sano;
		this.microchip = microchip;
		this.desparasitado = desparasitado;
		this.esterilizado = esterilizado;
	}
	
	public DatosMedicos() {
		
	}
	
	public String getVacunado() {
		return vacunado;
	}
	
	public String getSano() {
		return sano;
	}
	
	public String getMicrochip() {
		return microchip;
	}
	
	public String getDesparasitado() {
		return desparasitado;
	}
	
	public String getEsterilizado() {
		return esterilizado;
	}
	
	public void setVacunado(String vacunado) {
		this.vacunado = vacunado;
	}
	
	public void setSano(String sano) {
		this.sano = sano;
	}
	
	public void setMicrochip(String microchip) {
		this.microchip = microchip;
	}
	
	public void setDesparasitado(String desparasitado) {
		this.desparasitado = desparasitado;
	}
	
	public void setEsterilizado(String esterilizado) {
		this.esterilizado = esterilizado;
	}

	@Override
	public String toString() {
		return "DatosMedicos [codigo=" + codigo + ", vacunado=" + vacunado + ", sano=" + sano + ", microchip="
				+ microchip + ", desparasitado=" + desparasitado + ", esterilizado=" + esterilizado + "]";
	}
	
	
}
