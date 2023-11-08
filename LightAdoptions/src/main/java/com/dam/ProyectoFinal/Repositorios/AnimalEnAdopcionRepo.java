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
	List <AnimalEnAdopcion> findByCiudadIgnoreCase(String ciudad);
	
	List <AnimalEnAdopcion> findBySexoIgnoreCase(String sexo);
	
	List <AnimalEnAdopcion> findByEspecieIgnoreCase(String especie);
	
	List <AnimalEnAdopcion> findByEdadIgnoreCase(int edad);
	
	List <AnimalEnAdopcion> findByTamanyoIgnoreCase(String tamanyo);
	
	//Búsqueda por dos criterios
	List <AnimalEnAdopcion> findByCiudadSexo(String ciudad, String sexo);
	
	List <AnimalEnAdopcion> findByCiudadEspecie(String ciudad, String especie);
	
	List <AnimalEnAdopcion> findByCiudadEdad(String ciudad, int edad);
	
	List <AnimalEnAdopcion> findByCiudadTamanyo(String ciudad, String tamanyo);
	
	List <AnimalEnAdopcion> findBySexoEspecie(String sexo, String especie);
	
	List <AnimalEnAdopcion> findBySexoEdad(String sexo, int edad);
	
	List <AnimalEnAdopcion> findBySexoTamanyo(String sexo, String tamanyo);
	
	List <AnimalEnAdopcion> findByEspecieEdad(String especie, int edad);
	
	List <AnimalEnAdopcion> findByEspecieTamanyo(String especie, String tamanyo);
	
	List <AnimalEnAdopcion> findByEdadTamanyo(int edad, String tamanyo);
	
	//Búsqueda por tres criterios
	
	List <AnimalEnAdopcion> findByCiudadSexoEspecie(String ciudad, String sexo, String especie);
	
	List <AnimalEnAdopcion> findByCiudadSexoEdad(String ciudad, String sexo, int edad);
	
	List <AnimalEnAdopcion> findByCiudadSexoTamanyo(String ciudad, String sexo, String tamanyo);
	
	List <AnimalEnAdopcion> findByCiudadEspecieEdad(String ciudad, String especie, int edad);
	
	List <AnimalEnAdopcion> findByCiudadEspecieTamanyo(String ciudad, String especie, String tamanyo);
	
	List <AnimalEnAdopcion> findByCiudadEdadTamanyo(String ciudad, int edad, String tamanyo);
	
	List <AnimalEnAdopcion> findBySexoEspecieEdad(String sexo, String especie, int edad);
	
	List <AnimalEnAdopcion> findBySexoEspecieTamanyo(String sexo, String especie, String tamanyo);
	
	List <AnimalEnAdopcion> findBySexoEdadTamanyo(String sexo, int edad, String tamanyo);
	
	//Búsqueda por cuatro criterios
	
	List <AnimalEnAdopcion> findByCiudadSexoEspecieEdad(String ciudad, String sexo, String especie, int edad);
	
	List <AnimalEnAdopcion> findByCiudadSexoEspecieTamanyo(String ciudad, String sexo, String especie, String tamanyo);
	
	List <AnimalEnAdopcion> findByCiudadSexoEdadTamanyo(String ciudad, String sexo, int edad, String tamanyo);
	
	List <AnimalEnAdopcion> findByCiudadEspecieEdadTamanyo(String ciudad, String especie, int edad, String tamanyo);
	
	List <AnimalEnAdopcion> findBySexoEspecieEdadTamanyo(String sexo, String especie, int edad, String tamanyo);
	
	//Búsqueda por cinco criterios(es decir todos los atributos con los que se puede buscar)
	
	List <AnimalEnAdopcion> findByCiudadSexoEspecieEdadTamanyo(String ciuda, String sexo, String especie, int edad, String tamanyo);
	
	
}
