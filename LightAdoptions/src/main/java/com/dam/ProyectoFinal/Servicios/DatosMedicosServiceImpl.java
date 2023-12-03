package com.dam.ProyectoFinal.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam.ProyectoFinal.Entidades.DatosMedicos;
import com.dam.ProyectoFinal.Repositorios.DatosMedicosRepo;

@Service
public class DatosMedicosServiceImpl implements DatosMedicosServiceI{
	@Autowired
	private DatosMedicosRepo repository;

	@Override
	public List<DatosMedicos> obtenerDatosMedicos() {
		return repository.findAll();
	}

	@Override
	public DatosMedicos obtenerPorCodigo(int codigo) {
		return repository.findByCodigo(codigo);
	}

	@Override
	public void insertarDatosMedicos(DatosMedicos datos) {
		repository.save(datos);
	}

	@Override
	public void actualizarDatosMedicos(DatosMedicos datos) {
		repository.save(datos);
	}

	@Override
	public void eliminarDatosMedicosPorCodigo(int codigo) {
		repository.deleteById(codigo);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunado(String vacunado) {
		return repository.findByVacunado(vacunado);
	}

	@Override
	public List<DatosMedicos> obtenerPorSano(String sano) {
		return repository.findBySano(sano);
	}

	@Override
	public List<DatosMedicos> obtenerPorMicrochip(String microchip) {
		return repository.findByMicrochip(microchip);
	}

	@Override
	public List<DatosMedicos> obtenerPorDesparasitado(String desparasitado) {
		return repository.findByDesparasitado(desparasitado);
	}

	@Override
	public List<DatosMedicos> obtenerPorEsterilizado(String esterilizado) {
		return repository.findByEsterilizado(esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndSano(String vacunado, String sano) {
		return repository.findByVacunadoAndSano(vacunado, sano);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndMicrochip(String vacunado, String microchip) {
		return repository.findByVacunadoAndMicrochip(vacunado, microchip);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndDesparasitado(String vacunado, String desparasitado) {
		return repository.findByVacunadoAndDesparasitado(vacunado, desparasitado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndEsterilizado(String vacunado, String esterilizado) {
		return repository.findByVacunadoAndEsterilizado(vacunado, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorSanoAndMicrochip(String sano, String microchip) {
		return repository.findBySanoAndMicrochip(sano, microchip);
	}

	@Override
	public List<DatosMedicos> obtenerPorSanoAndDesparasitado(String sano, String desparasitado) {
		return repository.findBySanoAndDesparasitado(sano, desparasitado);
	}

	@Override
	public List<DatosMedicos> obtenerPorSanoAndEsterilizado(String sano, String esterilizado) {
		return repository.findBySanoAndEsterilizado(sano, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorMicrochipAndDesparasitado(String microchip, String desparasitado) {
		return repository.findByMicrochipAndDesparasitado(microchip, desparasitado);
	}

	@Override
	public List<DatosMedicos> obtenerPorMicrochipAndEsterilizado(String microchip, String esterilizado) {
		return repository.findByMicrochipAndEsterilizado(microchip, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorDesparasitadoAndEsterilizado(String desparasitado, String esterilizado) {
		return repository.findByDesparasitadoAndEsterilizado(desparasitado, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndSanoAndMicrochip(String vacunado, String sano, String microchip) {
		return repository.findByVacunadoAndSanoAndMicrochip(vacunado, sano, microchip);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndSanoAndDesparasitado(String vacunado, String sano,
			String desparasitado) {
		return repository.findByVacunadoAndSanoAndDesparasitado(vacunado, sano, desparasitado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndSanoAndEsterilizado(String vacunado, String sano,
			String esterilizado) {
		return repository.findByVacunadoAndSanoAndEsterilizado(vacunado, sano, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndMicrochipAndDesparasitado(String vacunado, String microchip,
			String desparasitado) {
		return repository.findByVacunadoAndMicrochipAndDesparasitado(vacunado, microchip, desparasitado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndMicrochipAndEsterilizado(String vacunado, String microchip,
			String esterilizado) {
		return repository.findByVacunadoAndMicrochipAndEsterilizado(vacunado, microchip, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndDesparasitadoAndEsterilizado(String vacunado, String desparasitado,
			String esterilizado) {
		return repository.findByVacunadoAndDesparasitadoAndEsterilizado(vacunado, desparasitado, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorSanoAndMicrochipAndDesparasitado(String sano, String microchip,
			String desparasitado) {
		return repository.findBySanoAndMicrochipAndDesparasitado(sano, microchip, desparasitado);
	}

	@Override
	public List<DatosMedicos> obtenerPorSanoAndMicrochipAndEsterilizado(String sano, String microchip,
			String esterilizado) {
		return repository.findBySanoAndMicrochipAndEsterilizado(sano, microchip, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorSanoAndDesparasitadoAndEsterilizado(String sano, String desparasitado,
			String esterilizado) {
		return repository.findBySanoAndDesparasitadoAndEsterilizado(sano, desparasitado, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorMicrochipAndDesparasitadoAndEsterilizado(String microchip, String desparasitado,
			String esterilizado) {
		return repository.findByMicrochipAndDesparasitadoAndEsterilizado(microchip, desparasitado, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndSanoAndMicrochipAndDesparasitado(String vacunado, String sano,
			String microchip, String desparasitado) {
		return repository.findByVacunadoAndSanoAndMicrochipAndDesparasitado(vacunado, sano, microchip, desparasitado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndSanoAndMicrochipAndEsterilizado(String vacunado, String sano,
			String microchip, String esterilizado) {
		return repository.findByVacunadoAndSanoAndMicrochipAndEsterilizado(vacunado, sano, microchip, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndSanoAndDesparasitadoAndEsterilizado(String vacunado, String sano,
			String desparasitado, String esterilizado) {
		return repository.findByVacunadoAndSanoAndDesparasitadoAndEsterilizado(vacunado, sano, desparasitado, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndMicrochipAndDesparasitadoAndEsterilizado(String vacunado,
			String microchip, String desparasitado, String esterilizado) {
		return repository.findByVacunadoAndMicrochipAndDesparasitadoAndEsterilizado(vacunado, microchip, desparasitado, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorSanoAndMicrochipAndDesparasitadoAndEsterilizado(String sano, String microchip,
			String desparasitado, String esterilizado) {
		return repository.findBySanoAndMicrochipAndDesparasitadoAndEsterilizado(sano, microchip, desparasitado, esterilizado);
	}

	@Override
	public List<DatosMedicos> obtenerPorVacunadoAndSanoAndMicrochipAndDesparasitadoAndEsterilizado(String vacunado,
			String sano, String microchip, String desparasitado, String esterilizado) {
		return repository.findByVacunadoAndSanoAndMicrochipAndDesparasitadoAndEsterilizado(vacunado, sano, microchip, desparasitado, esterilizado);
	}
}
