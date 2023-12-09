package com.dam.ProyectoFinal.Repositorios;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dam.ProyectoFinal.Entidades.AnimalAdoptado;
import com.dam.ProyectoFinal.Entidades.Usuario;

public interface AnimalAdoptadoRepo extends JpaRepository<AnimalAdoptado, Integer>{

	//Busqueda por id
	AnimalAdoptado findById(int id);
	
	//Lista de animales que ha adoptado un mismo usuario
	List <AnimalAdoptado> findByUsuario(Usuario usuario);
	
	
	//Un criterio
	List <AnimalAdoptado> findByNombre(String nombre);
	
	List <AnimalAdoptado> findBySexo(String sexo);
	
	List <AnimalAdoptado> findByCiudadOrigen(String ciudadOrigen);
	
	List <AnimalAdoptado> findByCiudadAdopcion(String ciudadAdopcion);
	
	List <AnimalAdoptado> findByFechaAdopcion(Date fechaAdopcion);
	
	
	//Dos criterios
	List <AnimalAdoptado> findByNombreAndSexo(String nombre, String sexo);
	
	List <AnimalAdoptado> findByNombreAndCiudadOrigen(String nombre, String ciudadOrigen);
	
	List <AnimalAdoptado> findByNombreAndCiudadAdopcion(String nombre, String ciudadAdopcion);
	
	List <AnimalAdoptado> findByNombreAndFechaAdopcion(String nombre, Date fechaAdopcion);
	
	List <AnimalAdoptado> findBySexoAndCiudadOrigen(String sexo, String ciudadOrigen);
	
	List <AnimalAdoptado> findBySexoAndCiudadAdopcion(String sexo, String ciudadAdopcion);
	
	List <AnimalAdoptado> findBySexoAndFechaAdopcion(String sexo, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByCiudadOrigenAndCiudadAdopcion(String ciudadOrigen, String ciudadAdopcion);
	
	List <AnimalAdoptado> findByCiudadOrigenAndFechaAdopcion(String ciudadOrigen, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByCiudadAdopcionAndFechaAdopcion(String ciudadAdopcion, Date fechaAdopcion);
	
	
	//Tres criterios
	List <AnimalAdoptado> findByNombreAndSexoAndCiudadOrigen(String nombre, String sexo, String ciudadOrigen);
	
	List <AnimalAdoptado> findByNombreAndSexoAndCiudadAdopcion(String nombre, String sexo, String ciudadAdopcion);
	
	List <AnimalAdoptado> findByNombreAndSexoAndFechaAdopcion(String nombre, String sexo, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByNombreAndCiudadOrigenAndCiudadAdopcion(String nombre, String ciudadOrigen, String ciudadAdopcion);
	
	List <AnimalAdoptado> findByNombreAndCiudadOrigenAndFechaAdopcion(String nombre, String ciudadOrigen, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByNombreAndCiudadAdopcionAndFechaAdopcion(String nombre, String ciudadAdopcion, Date fechaAdopcion);
	
	List <AnimalAdoptado> findBySexoAndCiudadOrigenAndCiudadAdopcion(String sexo, String ciudadOrigen, String ciudadAdopcion);
	
	List <AnimalAdoptado> findBySexoAndCiudadOrigenAndFechaAdopcion(String sexo, String ciudadOrigen, Date fechaAdopcion);
	
	List <AnimalAdoptado> findBySexoAndCiudadAdopcionAndFechaAdopcion(String sexo, String ciudadAdopcion, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion);
	
	
	//cuatro criterios
	List <AnimalAdoptado> findByNombreAndSexoAndCiudadOrigenAndCiudadAdopcion(String nombre, String sexo, String ciudadOrigen, String ciudadAdopcion);
	
	List <AnimalAdoptado> findByNombreAndSexoAndCiudadOrigenAndFechaAdopcion(String nombre, String sexo, String ciudadOrigen, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByNombreAndSexoAndCiudadAdopcionAndFechaAdopcion(String nombre, String sexo, String ciudadAdopcion, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByNombreAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String nombre, String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion);
	
	List <AnimalAdoptado> findBySexoAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String sexo, String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion);
	
	
	//cinco criterios
	List <AnimalAdoptado> findByNombreAndSexoAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String nombre, String sexo, String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion);
}
