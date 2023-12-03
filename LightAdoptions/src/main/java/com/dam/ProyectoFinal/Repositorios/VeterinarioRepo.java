package com.dam.ProyectoFinal.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dam.ProyectoFinal.Entidades.Veterinario;

public interface VeterinarioRepo extends JpaRepository<Veterinario, String>{

	//un criterio
	Veterinario findByCorreo(String correo);
	
	List <Veterinario> findByCiudad(String ciudad);
	
	List <Veterinario> findByTelefono(int telefono);
	
	List <Veterinario> findByDireccion(String direccion);
	
	List <Veterinario> findByNombre(String nombre);
	
	
	//Dos criterios	
	List <Veterinario> findByCiudadAndTelefono(String ciudad, int telefono);
		
	List <Veterinario> findByCiudadAndDireccion(String ciudad, String direccion);
	
	List <Veterinario> findByCiudadAndNombre(String ciudad, String nombre);
	
	List <Veterinario> findByTelefonoAndDireccion(int telefono, String direccion);
	
	List <Veterinario> findByTelefonoAndNombre(int telefono, String nombre);
	
	List <Veterinario> findByDireccionAndNombre(String direccion, String nombre);
	
	
	//Tres criterios
	List <Veterinario> findByCiudadAndTelefonoAndDireccion(String ciudad, int telefono, String direccion);
	
	List <Veterinario> findByCiudadAndTelefonoAndNombre(String ciudad, int telefono, String nombre);
	
	List <Veterinario> findByCiudadAndDireccionAndNombre(String ciudad, String direccion, String nombre);
	
	List <Veterinario> findByTelefonoAndDireccionAndNombre(int telefono, String direccion, String nombre);
	
	
	//cuatro criterios
	
	List <Veterinario> findByCiudadAndTelefonoAndDireccionAndNombre(String ciudad, int telefono, String direccion, String nombre);
} 
