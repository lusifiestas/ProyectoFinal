package com.dam.ProyectoFinal.Servicios;

import java.util.List;

import com.dam.ProyectoFinal.Entidades.AnimalEnAdopcion;

public interface AnimalEnAdopcionServiceI {

	public List<AnimalEnAdopcion> obtenerAnimalesEnAdopcion();

	public AnimalEnAdopcion obtenerPorCodigo(int codigo);

	public void insertarAnimalEnAdopcion(AnimalEnAdopcion animal);

	public void actualizarAnimalEnAdopcion(AnimalEnAdopcion animal);

	public void eliminarAnimalEnAdopcionPorCodigo(int codigo);

	// Búsqueda por un único criterio
	public List<AnimalEnAdopcion> obtenerPorCiudad(String ciudad);

	public List<AnimalEnAdopcion> obtenerPorSexo(String sexo);

	public List<AnimalEnAdopcion> obtenerPorEspecie(String especie);

	public List<AnimalEnAdopcion> obtenerPorEdad(int edad);

	public List<AnimalEnAdopcion> obtenerPorTamanyo(String tamanyo);

	// Búsqueda por dos criterios
	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexo(String ciudad, String sexo);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndEspecie(String ciudad, String especie);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndEdad(String ciudad, int edad);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndTamanyo(String ciudad, String tamanyo);

	public List<AnimalEnAdopcion> obtenerPorSexoAndEspecie(String sexo, String especie);

	public List<AnimalEnAdopcion> obtenerPorSexoAndEdad(String sexo, int edad);

	public List<AnimalEnAdopcion> obtenerPorSexoAndTamanyo(String sexo, String tamanyo);

	public List<AnimalEnAdopcion> obtenerPorEspecieAndEdad(String especie, int edad);

	public List<AnimalEnAdopcion> obtenerPorEspecieAndTamanyo(String especie, String tamanyo);

	public List<AnimalEnAdopcion> obtenerPorEdadAndTamanyo(int edad, String tamanyo);

	// Búsqueda por tres criterios

	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEspecie(String ciudad, String sexo, String especie);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEdad(String ciudad, String sexo, int edad);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndTamanyo(String ciudad, String sexo, String tamanyo);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndEspecieAndEdad(String ciudad, String especie, int edad);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndEspecieAndTamanyo(String ciudad, String especie, String tamanyo);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndEdadAndTamanyo(String ciudad, int edad, String tamanyo);

	public List<AnimalEnAdopcion> obtenerPorSexoAndEspecieAndEdad(String sexo, String especie, int edad);

	public List<AnimalEnAdopcion> obtenerPorSexoAndEspecieAndTamanyo(String sexo, String especie, String tamanyo);

	public List<AnimalEnAdopcion> obtenerPorSexoAndEdadAndTamanyo(String sexo, int edad, String tamanyo);

	// Búsqueda por cuatro criterios

	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEspecieAndEdad(String ciudad, String sexo, String especie, int edad);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEspecieAndTamanyo(String ciudad, String sexo, String especie,
			String tamanyo);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEdadAndTamanyo(String ciudad, String sexo, int edad, String tamanyo);

	public List<AnimalEnAdopcion> obtenerPorCiudadAndEspecieAndEdadAndTamanyo(String ciudad, String especie, int edad,
			String tamanyo);

	public List<AnimalEnAdopcion> obtenerPorSexoAndEspecieAndEdadAndTamanyo(String sexo, String especie, int edad, String tamanyo);

	// Búsqueda por cinco criterios(es decir todos los atributos con los que se
	// puede buscar)

	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEspecieAndEdadAndTamanyo(String ciudad, String sexo, String especie,
			int edad, String tamanyo);
}
