package com.dam.ProyectoFinal.Servicios;

import java.util.List;

import com.dam.ProyectoFinal.Entidades.Veterinario;

public interface VeterinarioServiceI {
	public List<Veterinario> obtenerVeterinarios();

	public Veterinario obtenerPorCorreo(String correo);

	public void insertarVeterinario(Veterinario vet);

	public void actualizarVeterinario(Veterinario vet);

	public void eliminarVeterinarioPorCorreo(String correo);

	// un criterio
	public List<Veterinario> obtenerPorCiudad(String ciudad);

	public List<Veterinario> obtenerPorTelefono(int telefono);

	public List<Veterinario> obtenerPorDireccion(String direccion);

	public List<Veterinario> obtenerPorNombre(String nombre);

	// Dos criterios
	public List<Veterinario> obtenerPorCiudadAndTelefono(String ciudad, int telefono);

	public List<Veterinario> obtenerPorCiudadAndDireccion(String ciudad, String direccion);

	public List<Veterinario> obtenerPorCiudadAndNombre(String ciudad, String nombre);

	public List<Veterinario> obtenerPorTelefonoAndDireccion(int telefono, String direccion);

	public List<Veterinario> obtenerPorTelefonoAndNombre(int telefono, String nombre);

	public List<Veterinario> obtenerPorDireccionAndNombre(String direccion, String nombre);

	// Tres criterios
	public List<Veterinario> obtenerPorCiudadAndTelefonoAndDireccion(String ciudad, int telefono, String direccion);

	public List<Veterinario> obtenerPorCiudadAndTelefonoAndNombre(String ciudad, int telefono, String nombre);

	public List<Veterinario> obtenerPorCiudadAndDireccionAndNombre(String ciudad, String direccion, String nombre);

	public List<Veterinario> obtenerPorTelefonoAndDireccionAndNombre(int telefono, String direccion, String nombre);

	// cuatro criterios

	public List<Veterinario> findByCiudadAndTelefonoAndDireccionAndNombre(String ciudad, int telefono, String direccion,
			String nombre);
}
