package com.dam.ProyectoFinal.Servicios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam.ProyectoFinal.Entidades.AnimalAdoptado;
import com.dam.ProyectoFinal.Repositorios.AnimalAdoptadoRepo;

@Service
public class AnimalAdoptadoServiceImpl implements AnimalAdoptadoServiceI{
	
	@Autowired
	private AnimalAdoptadoRepo repository;
	
	@Override
	public List<AnimalAdoptado> obtenerAnimalesAdoptados() {
		return repository.findAll();
	}

	@Override
	public AnimalAdoptado obtenerPorCodigo(int codigo) {
		return repository.findById(codigo);
	}

	@Override
	public void insertarAnimalAdoptado(AnimalAdoptado animal) {
		repository.save(animal);
	}

	@Override
	public void actualizarAnimalAdoptado(AnimalAdoptado animal) {
		repository.save(animal);
	}

	@Override
	public void eliminarAnimalAdoptadoPorCodigo(int codigo) {
		repository.deleteById(codigo);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombre(String nombre) {
		return repository.findByNombre(nombre);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorSexo(String sexo) {
		return repository.findBySexo(sexo);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorCiudadOrigen(String ciudadOrigen) {
		return repository.findByCiudadOrigen(ciudadOrigen);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorCiudadAdopcion(String ciudadAdopcion) {
		return repository.findByCiudadAdopcion(ciudadAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorFechaAdopcion(Date fechaAdopcion) {
		return repository.findByFechaAdopcion(fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndSexo(String nombre, String sexo) {
		return repository.findByNombreAndSexo(nombre, sexo);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndCiudadOrigen(String nombre, String ciudadOrigen) {
		return repository.findByNombreAndCiudadOrigen(nombre, ciudadOrigen);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndCiudadAdopcion(String nombre, String ciudadAdopcion) {
		return repository.findByNombreAndCiudadAdopcion(nombre, ciudadAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndFechaAdopcion(String nombre, Date fechaAdopcion) {
		return repository.findByNombreAndFechaAdopcion(nombre, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorSexoAndCiudadOrigen(String sexo, String ciudadOrigen) {
		return repository.findBySexoAndCiudadOrigen(sexo, ciudadOrigen);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorSexoAndCiudadAdopcion(String sexo, String ciudadAdopcion) {
		return repository.findBySexoAndCiudadAdopcion(sexo, ciudadAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorSexoAndFechaAdopcion(String sexo, Date fechaAdopcion) {
		return repository.findBySexoAndFechaAdopcion(sexo, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorCiudadOrigenAndCiudadAdopcion(String ciudadOrigen, String ciudadAdopcion) {
		return repository.findByCiudadOrigenAndCiudadAdopcion(ciudadOrigen, ciudadAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorCiudadOrigenAndFechaAdopcion(String ciudadOrigen, Date fechaAdopcion) {
		return repository.findByCiudadOrigenAndFechaAdopcion(ciudadOrigen, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorCiudadAdopcionAndFechaAdopcion(String ciudadAdopcion, Date fechaAdopcion) {
		return repository.findByCiudadAdopcionAndFechaAdopcion(ciudadAdopcion, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadOrigen(String nombre, String sexo,
			String ciudadOrigen) {
		return repository.findByNombreAndSexo(nombre, sexo);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadAdopcion(String nombre, String sexo,
			String ciudadAdopcion) {
		return repository.findByNombreAndSexoAndCiudadAdopcion(nombre, sexo, ciudadAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndFechaAdopcion(String nombre, String sexo,
			Date fechaAdopcion) {
		return repository.findByNombreAndSexoAndFechaAdopcion(nombre, sexo, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndCiudadOrigenAndCiudadAdopcion(String nombre, String ciudadOrigen,
			String ciudadAdopcion) {
		return repository.findByNombreAndCiudadOrigenAndCiudadAdopcion(nombre, ciudadOrigen, ciudadAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndCiudadOrigenAndFechaAdopcion(String nombre, String ciudadOrigen,
			Date fechaAdopcion) {
		return repository.findByNombreAndCiudadOrigenAndFechaAdopcion(nombre, ciudadOrigen, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndCiudadAdopcionAndFechaAdopcion(String nombre, String ciudadAdopcion,
			Date fechaAdopcion) {
		return repository.findByNombreAndCiudadAdopcionAndFechaAdopcion(nombre, ciudadAdopcion, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorSexoAndCiudadOrigenAndCiudadAdopcion(String sexo, String ciudadOrigen,
			String ciudadAdopcion) {
		return repository.findBySexoAndCiudadOrigenAndCiudadAdopcion(sexo, ciudadOrigen, ciudadAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorSexoAndCiudadOrigenAndFechaAdopcion(String sexo, String ciudadOrigen,
			Date fechaAdopcion) {
		return repository.findBySexoAndCiudadOrigenAndFechaAdopcion(sexo, ciudadOrigen, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorSexoAndCiudadAdopcionAndFechaAdopcion(String sexo, String ciudadAdopcion,
			Date fechaAdopcion) {
		return repository.findBySexoAndCiudadAdopcionAndFechaAdopcion(sexo, ciudadAdopcion, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String ciudadOrigen,
			String ciudadAdopcion, Date fechaAdopcion) {
		return repository.findByCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(ciudadOrigen, ciudadAdopcion, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadOrigenAndCiudadAdopcion(String nombre, String sexo,
			String ciudadOrigen, String ciudadAdopcion) {
		return repository.findByNombreAndSexoAndCiudadOrigenAndCiudadAdopcion(nombre, sexo, ciudadOrigen, ciudadAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadOrigenAndFechaAdopcion(String nombre, String sexo,
			String ciudadOrigen, Date fechaAdopcion) {
		return repository.findByNombreAndSexoAndCiudadAdopcionAndFechaAdopcion(nombre, sexo, ciudadOrigen, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadAdopcionAndFechaAdopcion(String nombre, String sexo,
			String ciudadAdopcion, Date fechaAdopcion) {
		return repository.findByNombreAndSexoAndCiudadAdopcionAndFechaAdopcion(nombre, sexo, ciudadAdopcion, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String nombre,
			String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion) {
		return repository.findByNombreAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(nombre, ciudadOrigen, ciudadAdopcion, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorSexoAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String sexo,
			String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion) {
		return repository.findBySexoAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(sexo, ciudadOrigen, ciudadAdopcion, fechaAdopcion);
	}

	@Override
	public List<AnimalAdoptado> obtenerPorNombreAndSexoAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(String nombre,
			String sexo, String ciudadOrigen, String ciudadAdopcion, Date fechaAdopcion) {
		return repository.findByNombreAndSexoAndCiudadOrigenAndCiudadAdopcionAndFechaAdopcion(nombre, sexo, ciudadOrigen, ciudadAdopcion, fechaAdopcion);
	}

}
