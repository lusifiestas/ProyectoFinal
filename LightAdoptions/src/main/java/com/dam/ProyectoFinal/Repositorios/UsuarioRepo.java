package com.dam.ProyectoFinal.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dam.ProyectoFinal.Entidades.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, String>{
	
	//un criterio
	Usuario findByCorreo(String correo); //es de tipo usuario y no list porque al ser clave primaria va a devolver un unico objeto
	
	List <Usuario> findByNombre(String nombre);
	
	List <Usuario> findByCiudad(String ciudad);
	
	List <Usuario> findByTipo(String tipo);
	
	//Dos criterios
	List <Usuario> findByNombreCiudad(String nombre, String ciudad);
	
	List <Usuario> findByNombreTipo(String nombre, String tipo);
	
	List <Usuario> findByCiudadTipo(String ciudad, String tipo);
	
	
	//Tres criterios
	List <Usuario> findByNombreCiudadTipo(String nombre, String ciudad, String tipo);
	
}
