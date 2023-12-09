package com.dam.ProyectoFinal.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam.ProyectoFinal.Entidades.Veterinario;
import com.dam.ProyectoFinal.Repositorios.VeterinarioRepo;

@Service
public class VeterinarioServiceImpl implements VeterinarioServiceI{
	@Autowired
	private VeterinarioRepo repository;

	@Override
	public List<Veterinario> obtenerVeterinarios() {
		return repository.findAll();
	}

	@Override
	public Veterinario obtenerPorCorreo(String correo) {
		return repository.findByCorreo(correo);
	}

	@Override
	public void insertarVeterinario(Veterinario vet) {
		repository.save(vet);
	}

	@Override
	public void actualizarVeterinario(Veterinario vet) {
		repository.save(vet);
	}

	@Override
	public void eliminarVeterinarioPorCorreo(String correo) {
		repository.deleteById(correo);;
	}

	@Override
	public List<Veterinario> obtenerPorCiudad(String ciudad) {
		return repository.findByCiudad(ciudad);
	}

	@Override
	public List<Veterinario> obtenerPorTelefono(int telefono) {
		return repository.findByTelefono(telefono);
	}

	@Override
	public List<Veterinario> obtenerPorDireccion(String direccion) {
		return repository.findByDireccion(direccion);
	}

	@Override
	public List<Veterinario> obtenerPorNombre(String nombre) {
		return repository.findByNombre(nombre);
	}

	@Override
	public List<Veterinario> obtenerPorCiudadAndTelefono(String ciudad, int telefono) {
		return repository.findByCiudadAndTelefono(ciudad, telefono);
	}

	@Override
	public List<Veterinario> obtenerPorCiudadAndDireccion(String ciudad, String direccion) {
		return repository.findByCiudadAndDireccion(ciudad, direccion);
	}

	@Override
	public List<Veterinario> obtenerPorCiudadAndNombre(String ciudad, String nombre) {
		return repository.findByCiudadAndNombre(ciudad, nombre);
	}

	@Override
	public List<Veterinario> obtenerPorTelefonoAndDireccion(int telefono, String direccion) {
		return repository.findByTelefonoAndDireccion(telefono, direccion);
	}

	@Override
	public List<Veterinario> obtenerPorTelefonoAndNombre(int telefono, String nombre) {
		return repository.findByTelefonoAndNombre(telefono, nombre);
	}

	@Override
	public List<Veterinario> obtenerPorDireccionAndNombre(String direccion, String nombre) {
		return repository.findByDireccionAndNombre(direccion, nombre);
	}

	@Override
	public List<Veterinario> obtenerPorCiudadAndTelefonoAndDireccion(String ciudad, int telefono, String direccion) {
		return repository.findByCiudadAndTelefonoAndDireccion(ciudad, telefono, direccion);
	}

	@Override
	public List<Veterinario> obtenerPorCiudadAndTelefonoAndNombre(String ciudad, int telefono, String nombre) {
		return repository.findByCiudadAndTelefonoAndNombre(ciudad, telefono, nombre);
	}

	@Override
	public List<Veterinario> obtenerPorCiudadAndDireccionAndNombre(String ciudad, String direccion, String nombre) {
		return repository.findByCiudadAndDireccionAndNombre(ciudad, direccion, nombre);
	}

	@Override
	public List<Veterinario> obtenerPorTelefonoAndDireccionAndNombre(int telefono, String direccion, String nombre) {
		return repository.findByTelefonoAndDireccionAndNombre(telefono, direccion, nombre);
	}

	@Override
	public List<Veterinario> findByCiudadAndTelefonoAndDireccionAndNombre(String ciudad, int telefono, String direccion,
			String nombre) {
		return repository.findByCiudadAndTelefonoAndDireccionAndNombre(ciudad, telefono, direccion, nombre);
	}
}
