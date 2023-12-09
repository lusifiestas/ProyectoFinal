package com.dam.ProyectoFinal.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dam.ProyectoFinal.Entidades.AnimalEnAdopcion;
import com.dam.ProyectoFinal.Entidades.Usuario;
import com.dam.ProyectoFinal.Entidades.Veterinario;

public interface AnimalEnAdopcionRepo extends JpaRepository<AnimalEnAdopcion, Integer>{
	
	//Busqueda por id
	AnimalEnAdopcion findById(int id);
	
	//Lista de animales que da en adopcion un usuario
	List <AnimalEnAdopcion> findByUsuario(Usuario usuario);
	
	//lista de animales de los que se encarga una misma clinica veterinaria
	List <AnimalEnAdopcion> findByVeterinario(Veterinario veterinario);
	
	//Búsqueda por un único criterio
	List <AnimalEnAdopcion> findByCiudad(String ciudad);
	
	List <AnimalEnAdopcion> findBySexo(String sexo);
	
	List <AnimalEnAdopcion> findByEspecie(String especie);
	
	List <AnimalEnAdopcion> findByEdad(int edad);
	
	List <AnimalEnAdopcion> findByTamanyo(String tamanyo);
	
	//Búsqueda por dos criterios
	List <AnimalEnAdopcion> findByCiudadAndSexo(String ciudad, String sexo);
	
	List <AnimalEnAdopcion> findByCiudadAndEspecie(String ciudad, String especie);
	
	List <AnimalEnAdopcion> findByCiudadAndEdad(String ciudad, int edad);
	
	List <AnimalEnAdopcion> findByCiudadAndTamanyo(String ciudad, String tamanyo);
	
	List <AnimalEnAdopcion> findBySexoAndEspecie(String sexo, String especie);
	
	List <AnimalEnAdopcion> findBySexoAndEdad(String sexo, int edad);
	
	List <AnimalEnAdopcion> findBySexoAndTamanyo(String sexo, String tamanyo);
	
	List <AnimalEnAdopcion> findByEspecieAndEdad(String especie, int edad);
	
	List <AnimalEnAdopcion> findByEspecieAndTamanyo(String especie, String tamanyo);
	
	List <AnimalEnAdopcion> findByEdadAndTamanyo(int edad, String tamanyo);
	
	//Búsqueda por tres criterios
	
	List <AnimalEnAdopcion> findByCiudadAndSexoAndEspecie(String ciudad, String sexo, String especie);
	
	List <AnimalEnAdopcion> findByCiudadAndSexoAndEdad(String ciudad, String sexo, int edad);
	
	List <AnimalEnAdopcion> findByCiudadAndSexoAndTamanyo(String ciudad, String sexo, String tamanyo);
	
	List <AnimalEnAdopcion> findByCiudadAndEspecieAndEdad(String ciudad, String especie, int edad);
	
	List <AnimalEnAdopcion> findByCiudadAndEspecieAndTamanyo(String ciudad, String especie, String tamanyo);
	
	List <AnimalEnAdopcion> findByCiudadAndEdadAndTamanyo(String ciudad, int edad, String tamanyo);
	
	List <AnimalEnAdopcion> findBySexoAndEspecieAndEdad(String sexo, String especie, int edad);
	
	List <AnimalEnAdopcion> findBySexoAndEspecieAndTamanyo(String sexo, String especie, String tamanyo);
	
	List <AnimalEnAdopcion> findBySexoAndEdadAndTamanyo(String sexo, int edad, String tamanyo);
	
	//Búsqueda por cuatro criterios
	
	List <AnimalEnAdopcion> findByCiudadAndSexoAndEspecieAndEdad(String ciudad, String sexo, String especie, int edad);
	
	List <AnimalEnAdopcion> findByCiudadAndSexoAndEspecieAndTamanyo(String ciudad, String sexo, String especie, String tamanyo);
	
	List <AnimalEnAdopcion> findByCiudadAndSexoAndEdadAndTamanyo(String ciudad, String sexo, int edad, String tamanyo);
	
	List <AnimalEnAdopcion> findByCiudadAndEspecieAndEdadAndTamanyo(String ciudad, String especie, int edad, String tamanyo);
	
	List <AnimalEnAdopcion> findBySexoAndEspecieAndEdadAndTamanyo(String sexo, String especie, int edad, String tamanyo);
	
	//Búsqueda por cinco criterios(es decir todos los atributos con los que se puede buscar)
	
	List <AnimalEnAdopcion> findByCiudadAndSexoAndEspecieAndEdadAndTamanyo(String ciudad, String sexo, String especie, int edad, String tamanyo);
	
	
}
