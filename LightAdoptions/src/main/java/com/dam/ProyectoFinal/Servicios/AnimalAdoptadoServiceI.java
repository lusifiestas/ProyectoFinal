package com.dam.ProyectoFinal.Servicios;

import java.util.Date;
import java.util.List;

import com.dam.ProyectoFinal.Entidades.AnimalAdoptado;

public interface AnimalAdoptadoServiceI {
	public List<AnimalAdoptado> obtenerAnimalesAdoptados();

	public AnimalAdoptado obtenerPorCodigo(int codigo);

	public void insertarAnimalAdoptado(AnimalAdoptado animal);

	public void actualizarAnimalAdoptado(AnimalAdoptado animal);

	public void eliminarAnimalAdoptadoPorCodigo(int codigo);

	// Un criterio
	public List<AnimalAdoptado> obtenerPorNombre(String nombre);

	public List<AnimalAdoptado> obtenerPorSexo(String sexo);

	public List<AnimalAdoptado> obtenerPorCiudadOrigen(String ciudadOrigen);

	public List<AnimalAdoptado> obtenerPorCiudadAdopcion(String ciudadAdopcion);

	public List<AnimalAdoptado> obtenerPorFechaAdopcion(Date fechaAdopcion);

	// Dos criterios
	public List<AnimalAdoptado> obtenerPorNombreAndSexo(String nombre, String sexo);

	public List<AnimalAdoptado> obtenerPorNombreAndCiudadOrigen(String nombre, String ciudadOrigen);

	public List<AnimalAdoptado> obtenerPorNombreAndCiudadAdopcion(String nombre, String ciudadAdopcion);

	public List<AnimalAdoptado> obtenerPorNombreAndFechaAdopcion(String nombre, Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorSexoAndCiudadOrigen(String sexo, String ciudadOrigen);

	public List<AnimalAdoptado> obtenerPorSexoAndCiudadAdopcion(String sexo, String ciudadAdopcion);

	public List<AnimalAdoptado> obtenerPorSexoAndFechaAdopcion(String sexo, Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorCiudadOrigenAndCiudadAdopcion(String ciudadOrigen, String ciudadAdopcion);

	public List<AnimalAdoptado> obtenerPorCiudadOrigenAndFechaAdopcion(String ciudadOrigen, Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorCiudadAdopcionAndFechaAdopcion(String ciudadAdopcion, Date fechaAdopcion);

	// Tres criterios
	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadOrigen(String nombre, String sexo, String ciudadOrigen);

	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadAdopcion(String nombre, String sexo, String ciudadAdopcion);

	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndFechaAdopcion(String nombre, String sexo, Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorNombreAndCiudadOrigenAndCiudadAdopcion(String nombre, String ciudadOrigen,
			String ciudadAdopcion);

	public List<AnimalAdoptado> obtenerPorNombreAndCiudadOrigenAndFechaAdopcion(String nombre, String ciudadOrigen,
			Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorNombreAndCiudadAdopcionAndFechaAdopcion(String nombre, String ciudadAdopcion,
			Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorSexoAndCiudadOrigenAndCiudadAdopcion(String sexo, String ciudadOrigen,
			String ciudadAdopcion);

	public List<AnimalAdoptado> obtenerPorSexoAndCiudadOrigenAndFechaAdopcion(String sexo, String ciudadOrigen,
			Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorSexoAndCiudadAdopcionAndFechaAdopcion(String sexo, String ciudadAdopcion,
			Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String ciudadOrigen,
			String ciudadAdopcion, Date fechaAdopcion);

	// cuatro criterios
	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadOrigenAndCiudadAdopcion(String nombre, String sexo,
			String ciudadOrigen, String ciudadAdopcion);

	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadOrigenAndFechaAdopcion(String nombre, String sexo,
			String ciudadOrigen, Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadAdopcionAndFechaAdopcion(String nombre, String sexo,
			String ciudadAdopcion, Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorNombreAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String nombre, String ciudadOrigen,
			String ciudadAdopcion, Date fechaAdopcion);

	public List<AnimalAdoptado> obtenerPorSexoAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String sexo, String ciudadOrigen,
			String ciudadAdopcion, Date fechaAdopcion);

	// cinco criterios
	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String nombre, String sexo,
			String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion);

}
