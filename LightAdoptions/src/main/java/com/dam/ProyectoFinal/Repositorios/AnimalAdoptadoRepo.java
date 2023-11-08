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
	List <AnimalAdoptado> findByNombreSexo(String nombre, String sexo);
	
	List <AnimalAdoptado> findByNombreCiudadOrigen(String nombre, String ciudadOrigen);
	
	List <AnimalAdoptado> findByNombreCiudadAdopcion(String nombre, String ciudadAdopcion);
	
	List <AnimalAdoptado> findByNombreFechaAdopcion(String nombre, Date fechaAdopcion);
	
	List <AnimalAdoptado> findBySexoCiudadOrigen(String sexo, String ciudadOrigen);
	
	List <AnimalAdoptado> findBySexoCiudadAdopcion(String sexo, String ciudadAdopcion);
	
	List <AnimalAdoptado> findBySexoFechaAdopcion(String sexo, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByCiudadOrigenCiudadAdopcion(String ciudadOrigen, String ciudadAdopcion);
	
	List <AnimalAdoptado> findByCiudadOrigenFechaAdopcion(String ciudadOrigen, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByCiudadAdopcionFechaAdopcion(String ciudadAdopcion, Date fechaAdopcion);
	
	
	//Tres criterios
	List <AnimalAdoptado> findByNombreSexoCiudadOrigen(String nombre, String sexo, String ciudadOrigen);
	
	List <AnimalAdoptado> findByNombreSexoCiudadAdopcion(String nombre, String sexo, String ciudadAdopcion);
	
	List <AnimalAdoptado> findByNombreSexoFechaAdopcion(String nombre, String sexo, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByNombreCiudadOrigenCiudadAdopcion(String nombre, String ciudadOrigen, String ciudadAdopcion);
	
	List <AnimalAdoptado> findByNombreCiudadOrigenFechaAdopcion(String nombre, String ciudadOrigen, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByNombreCiudadAdopcionFechaAdopcion(String nombre, String ciudadAdopcion, Date fechaAdopcion);
	
	List <AnimalAdoptado> findBySexoCiudadOrigenCiudadAdopcion(String sexo, String ciudadOrigen, String ciudadAdopcion);
	
	List <AnimalAdoptado> findBySexoCiudadOrigenFechaAdopcion(String sexo, String ciudadOrigen, Date fechaAdopcion);
	
	List <AnimalAdoptado> findBySexoCiudadAdopcionFechaAdopcion(String sexo, String ciudadAdopcion, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByCiudadOrigenCiudadAdopcionFechaAdopcion(String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion);
	
	
	//cuatro criterios
	List <AnimalAdoptado> findByNombreSexoCiudadOrigenCiudadAdopcion(String nombre, String sexo, String ciudadOrigen, String ciudadAdopcion);
	
	List <AnimalAdoptado> findByNombreSexoCiudadOrigenFechaAdopcion(String nombre, String sexo, String ciudadOrigen, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByNombreSexoCiudadAdopcionFechaAdopcion(String nombre, String sexo, String ciudadAdopcion, Date fechaAdopcion);
	
	List <AnimalAdoptado> findByNombreCiudadOrigenCiudadAdopcionFechaAdopcion(String nombre, String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion);
	
	List <AnimalAdoptado> findBySexoCiudadOrigenCiudadAdopcionFechaAdopcion(String sexo, String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion);
	
	
	//cinco criterios
	List <AnimalAdoptado> findByNombreSexoCiudadOrigenCiudadAdopcionFechaAdopcion(String nombre, String sexo, String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion);
}
