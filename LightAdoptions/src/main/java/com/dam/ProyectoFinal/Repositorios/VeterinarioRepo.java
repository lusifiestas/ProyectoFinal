package com.dam.ProyectoFinal.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dam.ProyectoFinal.Entidades.Veterinario;

public interface VeterinarioRepo extends JpaRepository<Veterinario, Integer>{

	//un criterio
	Veterinario findByCorreo(String correo);
	
	List <Veterinario> findByCiudad(String ciudad);
	
	List <Veterinario> findByTelefono(int telefono);
	
	List <Veterinario> findByDireccion(String direccion);
	
	List <Veterinario> findByNombre(String nombre);
	
	
	//Dos criterios	
	List <Veterinario> findByCiudadTelefono(String ciudad, int telefono);
		
	List <Veterinario> findByCiudadDireccion(String ciudad, String direccion);
	
	List <Veterinario> findByCiudadNombre(String ciudad, String nombre);
	
	List <Veterinario> findByTelefonoDireccion(int telefono, String direccion);
	
	List <Veterinario> findByTelefonoNombre(int telefono, String nombre);
	
	List <Veterinario> findByDireccionNombre(String direccion, String nombre);
	
	
	//Tres criterios
	List <Veterinario> findByCiudadTelefonoDireccion(String ciudad, int telefono, String direccion);
	
	List <Veterinario> findByCiudadTelefonoNombre(String ciudad, int telefono, String nombre);
	
	List <Veterinario> findByCiudadDireccionNombre(String ciudad, String direccion, String nombre);
	
	List <Veterinario> findByTelefonoDireccionNombre(int telefono, String direccion, String nombre);
	
	
	//cuatro criterios
	
	List <Veterinario> findByCiudadTelefonoDireccionNombre(String ciudad, int telefono, String direccion, String nombre);
} 
