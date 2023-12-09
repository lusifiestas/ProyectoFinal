package com.dam.ProyectoFinal.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "AnimalEnAdopcion")
public class AnimalEnAdopcion {
	/* Codigo de los animales dados en adopción(PK) */
	@Id
	@NotEmpty(message = "debe especificar el codigo del animalAdoptado")
	@Column(name = "codigo", nullable = false)
	private int codigo;

	/* Indica la ciudad donde se da en adopcion el animal */
	@NotEmpty(message = "debe especificar la ciudad desde donde da en adopcion al animal")
	@Column(name = "ciudad", nullable = false)
	private String ciudad;

	/* Datos extras del animal dado en adopcion */
	@Column(name = "datos_adicionales", nullable = true)
	private String datosAdicionales;

	/* Indica lo que pesa el animal */
	@NotEmpty(message = "debe especificar el peso del animal")
	@Column(name = "peso", nullable = false)
	private double peso;

	/* Indica si el animal es macho o hembra */
	@NotEmpty(message = "debe especificar el sexo del animal")
	@Column(name = "sexo", nullable = false)
	private String sexo;// podría ponerlo como enum de macho/hembra

	/* Indica que animal es */
	@NotEmpty(message = "debe especificar que tipo de animal es")
	@Column(name = "especie", nullable = false)
	private String especie;

	/* Indica la edad aproximada del animal */
	@NotEmpty(message = "debe especificar la edad aproximada del animal")
	@Column(name = "edad", nullable = false)
	private int edad;

	/* Aqui se describe la personalidad del animal */
	@NotEmpty(message = "debe especificar como es la personalidad del animal")
	@Column(name = "personalidad", nullable = false)
	private String personalidad;

	/* Aqui se describiran los requisitos para la adopcion del animal */
	@NotEmpty(message = "debe especificar los requisitos para la adopcion del animal")
	@Column(name = "requisitos_adopcion", nullable = false)
	private String requisitosAdopcion;

	/** Aqui se describe el nivel de actividad del animal */
	@NotEmpty(message = "debe indicar el nivel de actividad del animal")
	@Column(name = "nivel_actividad", nullable = false)
	private String nivelActividad;

	/*
	 * Esta variable se va a usar para gestionar el estado del animal(EN ADOPCION/EN
	 * ACOGIDA/ADOPTADO)
	 */
	@NotEmpty(message = "debe especificar el estado del animal")
	@Column(name = "estado", nullable = false)
	private String estado;

	/* Aqui se va a contar un poco sobre la historia del animal */
	@Column(name = "historia", nullable = true)
	private String historia;

	/* Indica el tamaño del animal(GRANDE/MEDIANO/PEQUEÑO) */
	@NotEmpty(message = "debe especificar el tamaño del animal")
	@Column(name = "tamanyo", nullable = false)
	private String tamanyo;// puede ser enum entre grande, mediano y pequeño

	/* Imagen principal del animal */
	@NotEmpty(message = "debe añadir al menos una foto del animal")
	@Column(name = "imagen_principal", nullable = false)
	private String imagenPrincipal;

	/* Imagen extra del animal */
	@Column(name = "imagen_extra1", nullable = true)
	private String imagenExtra1;

	/* Imagen extra del animal */
	@Column(name = "imagen_extra2", nullable = true)
	private String imagenExtra2;

	/* Imagen extra del animal */
	@Column(name = "imagen_extra3", nullable = true)
	private String imagenExtra3;

	/* atributo relacional de relacion N:1 con usuario */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "correo_usuario", referencedColumnName = "correo", nullable = false)
	private Usuario usuario;

	/* atributo relacional de relacion N:1 con veterinario */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "correo_veterinario", referencedColumnName = "correo", nullable = false)
	private Veterinario veterinario;

	/* atributo relacional de relacion 1:1 con datos medicos */
	@OneToOne
	@JoinColumn(name = "codigo_datos_medicos", referencedColumnName = "codigo", nullable = false)
	private DatosMedicos datosMedicos;

	public AnimalEnAdopcion() {

	}

	public AnimalEnAdopcion(int codigo,
			@NotEmpty(message = "debe especificar la ciudad desde donde da en adopcion al animal") String ciudad,
			String datosAdicionales, @NotEmpty(message = "debe especificar el peso del animal") double peso,
			@NotEmpty(message = "debe especificar el sexo del animal") String sexo,
			@NotEmpty(message = "debe especificar que tipo de animal es") String especie,
			@NotEmpty(message = "debe especificar la edad aproximada del animal") int edad,
			@NotEmpty(message = "debe especificar como es la personalidad del animal") String personalidad,
			@NotEmpty(message = "debe especificar los requisitos para la adopcion del animal") String requisitosAdopcion,
			@NotEmpty(message = "debe indicar el nivel de actividad del animal") String nivelActividad,
			@NotEmpty(message = "debe especificar el estado del animal") String estado, String historia,
			@NotEmpty(message = "debe especificar el tamaño del animal") String tamanyo,
			@NotEmpty(message = "debe añadir al menos una foto del animal") String imagenPrincipal, String imagenExtra1,
			String imagenExtra2, String imagenExtra3, Usuario usuario, Veterinario veterinario,
			DatosMedicos datosMedicos) {

		this.codigo = codigo;
		this.ciudad = ciudad;
		this.datosAdicionales = datosAdicionales;
		this.peso = peso;
		this.sexo = sexo;
		this.especie = especie;
		this.edad = edad;
		this.personalidad = personalidad;
		this.requisitosAdopcion = requisitosAdopcion;
		this.nivelActividad = nivelActividad;
		this.estado = estado;
		this.historia = historia;
		this.tamanyo = tamanyo;
		this.imagenPrincipal = imagenPrincipal;
		this.imagenExtra1 = imagenExtra1;
		this.imagenExtra2 = imagenExtra2;
		this.imagenExtra3 = imagenExtra3;
		this.usuario = usuario;
		this.veterinario = veterinario;
		this.datosMedicos = datosMedicos;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getDatosAdicionales() {
		return datosAdicionales;
	}

	public double getPeso() {
		return peso;
	}

	public String getSexo() {
		return sexo;
	}

	public String getEspecie() {
		return especie;
	}

	public int getEdad() {
		return edad;
	}

	public String getPersonalidad() {
		return personalidad;
	}

	public String getRequisitosAdopcion() {
		return requisitosAdopcion;
	}

	public String getNivelActividad() {
		return nivelActividad;
	}

	public String getEstado() {
		return estado;
	}

	public String getHistoria() {
		return historia;
	}

	public String getTamanyo() {
		return tamanyo;
	}

	public String getImagenPrincipal() {
		return imagenPrincipal;
	}

	public String getImagenExtra1() {
		return imagenExtra1;
	}

	public String getImagenExtra2() {
		return imagenExtra2;
	}

	public String getImagenExtra3() {
		return imagenExtra3;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public DatosMedicos getDatosMedicos() {
		return datosMedicos;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setDatosAdicionales(String datosAdicionales) {
		this.datosAdicionales = datosAdicionales;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPersonalidad(String personalidad) {
		this.personalidad = personalidad;
	}

	public void setRequisitosAdopcion(String requisitosAdopcion) {
		this.requisitosAdopcion = requisitosAdopcion;
	}

	public void setNivelActividad(String nivelActividad) {
		this.nivelActividad = nivelActividad;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public void setTamanyo(String tamanyo) {
		this.tamanyo = tamanyo;
	}

	public void setImagenPrincipal(String imagenPrincipal) {
		this.imagenPrincipal = imagenPrincipal;
	}

	public void setImagenExtra1(String imagenExtra1) {
		this.imagenExtra1 = imagenExtra1;
	}

	public void setImagenExtra2(String imagenExtra2) {
		this.imagenExtra2 = imagenExtra2;
	}

	public void setImagenExtra3(String imagenExtra3) {
		this.imagenExtra3 = imagenExtra3;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public void setDatosMedicos(DatosMedicos datosMedicos) {
		this.datosMedicos = datosMedicos;
	}

	@Override
	public String toString() {
		return "AnimalEnAdopcion [codigo=" + codigo + ", ciudad=" + ciudad + ", datosAdicionales=" + datosAdicionales
				+ ", peso=" + peso + ", sexo=" + sexo + ", especie=" + especie + ", edad=" + edad + ", personalidad="
				+ personalidad + ", requisitosAdopcion=" + requisitosAdopcion + ", nivelActividad=" + nivelActividad
				+ ", estado=" + estado + ", historia=" + historia + ", tamanyo=" + tamanyo + ", usuario=" + usuario
				+ ", veterinario=" + veterinario + ", datosMedicos=" + datosMedicos + "]";
	}

}
