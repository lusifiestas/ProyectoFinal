package com.dam.ProyectoFinal.Repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dam.ProyectoFinal.Entidades.Usuario;
import java.util.Optional;

public interface UsuarioRepo extends JpaRepository<Usuario, String>{
	
	//un criterio
	Optional<Usuario> findByCorreo(String correo); //es de tipo usuario y no list porque al ser clave primaria va a devolver un unico objeto
	
	Usuario findUserByCorreo(String correo);
	
	List <Usuario> findByNombre(String nombre);
	
	List <Usuario> findByCiudad(String ciudad);
	
	List <Usuario> findByTipo(String tipo);
	
	//Dos criterios
	List <Usuario> findByNombreAndCiudad(String nombre, String ciudad);
	
	List <Usuario> findByNombreAndTipo(String nombre, String tipo);
	
	List <Usuario> findByCiudadAndTipo(String ciudad, String tipo);
	
	
	//Tres criterios
	List <Usuario> findByNombreAndCiudadAndTipo(String nombre, String ciudad, String tipo);
	
}
