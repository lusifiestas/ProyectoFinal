package com.dam.ProyectoFinal.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam.ProyectoFinal.Entidades.AnimalEnAdopcion;
import com.dam.ProyectoFinal.Repositorios.AnimalEnAdopcionRepo;

@Service
public class AnimalEnAdopcionServiceImpl implements AnimalEnAdopcionServiceI{
	
	@Autowired
	private AnimalEnAdopcionRepo repository;

	@Override
	public List<AnimalEnAdopcion> obtenerAnimalesEnAdopcion() {
		return repository.findAll();
	}

	@Override
	public AnimalEnAdopcion obtenerPorCodigo(int codigo) {
		return repository.findById(codigo);
	}

	@Override
	public void insertarAnimalEnAdopcion(AnimalEnAdopcion animal) {
		repository.save(animal);
	}

	@Override
	public void actualizarAnimalEnAdopcion(AnimalEnAdopcion animal) {
		repository.save(animal);
	}

	@Override
	public void eliminarAnimalEnAdopcionPorCodigo(int codigo) {
		repository.deleteById(codigo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudad(String ciudad) {
		return repository.findByCiudad(ciudad);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorSexo(String sexo) {
		return repository.findBySexo(sexo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorEspecie(String especie) {
		return repository.findByEspecie(especie);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorEdad(int edad) {
		return repository.findByEdad(edad);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorTamanyo(String tamanyo) {
		return repository.findByTamanyo(tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexo(String ciudad, String sexo) {
		return repository.findByCiudadAndSexo(ciudad, sexo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndEspecie(String ciudad, String especie) {
		return repository.findByCiudadAndEspecie(ciudad, especie);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndEdad(String ciudad, int edad) {
		return repository.findByCiudadAndEdad(ciudad, edad);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndTamanyo(String ciudad, String tamanyo) {
		return repository.findByCiudadAndTamanyo(ciudad, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorSexoAndEspecie(String sexo, String especie) {
		return repository.findBySexoAndEspecie(sexo, especie);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorSexoAndEdad(String sexo, int edad) {
		return repository.findBySexoAndEdad(sexo, edad);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorSexoAndTamanyo(String sexo, String tamanyo) {
		return repository.findBySexoAndTamanyo(sexo, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorEspecieAndEdad(String especie, int edad) {
		return repository.findByEspecieAndEdad(especie, edad);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorEspecieAndTamanyo(String especie, String tamanyo) {
		return repository.findByEspecieAndTamanyo(especie, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorEdadAndTamanyo(int edad, String tamanyo) {
		return repository.findByEdadAndTamanyo(edad, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEspecie(String ciudad, String sexo, String especie) {
		return repository.findByCiudadAndSexoAndEspecie(ciudad, sexo, especie);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEdad(String ciudad, String sexo, int edad) {
		return repository.findByCiudadAndSexoAndEdad(ciudad, sexo, edad);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndTamanyo(String ciudad, String sexo, String tamanyo) {
		return repository.findByCiudadAndSexoAndTamanyo(ciudad, sexo, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndEspecieAndEdad(String ciudad, String especie, int edad) {
		return repository.findByCiudadAndEspecieAndEdad(ciudad, especie, edad);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndEspecieAndTamanyo(String ciudad, String especie, String tamanyo) {
		return repository.findByCiudadAndEspecieAndTamanyo(ciudad, especie, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndEdadAndTamanyo(String ciudad, int edad, String tamanyo) {
		return repository.findByCiudadAndEdadAndTamanyo(ciudad, edad, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorSexoAndEspecieAndEdad(String sexo, String especie, int edad) {
		return repository.findBySexoAndEspecieAndEdad(sexo, especie, edad);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorSexoAndEspecieAndTamanyo(String sexo, String especie, String tamanyo) {
		return repository.findBySexoAndEspecieAndTamanyo(sexo, especie, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorSexoAndEdadAndTamanyo(String sexo, int edad, String tamanyo) {
		return repository.findBySexoAndEdadAndTamanyo(sexo, edad, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEspecieAndEdad(String ciudad, String sexo, String especie,
			int edad) {
		return repository.findByCiudadAndSexoAndEspecieAndEdad(ciudad, sexo, especie, edad);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEspecieAndTamanyo(String ciudad, String sexo,
			String especie, String tamanyo) {
		return repository.findByCiudadAndSexoAndEspecieAndTamanyo(ciudad, sexo, especie, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEdadAndTamanyo(String ciudad, String sexo, int edad,
			String tamanyo) {
		return repository.findByCiudadAndSexoAndEdadAndTamanyo(ciudad, sexo, edad, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndEspecieAndEdadAndTamanyo(String ciudad, String especie, int edad,
			String tamanyo) {
		return repository.findByCiudadAndEspecieAndEdadAndTamanyo(ciudad, especie, edad, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorSexoAndEspecieAndEdadAndTamanyo(String sexo, String especie, int edad,
			String tamanyo) {
		return repository.findBySexoAndEspecieAndEdadAndTamanyo(sexo, especie, edad, tamanyo);
	}

	@Override
	public List<AnimalEnAdopcion> obtenerPorCiudadAndSexoAndEspecieAndEdadAndTamanyo(String ciudad, String sexo,
			String especie, int edad, String tamanyo) {
		return repository.findByCiudadAndSexoAndEspecieAndEdadAndTamanyo(ciudad, sexo, especie, edad, tamanyo);
	}
	
	
}
