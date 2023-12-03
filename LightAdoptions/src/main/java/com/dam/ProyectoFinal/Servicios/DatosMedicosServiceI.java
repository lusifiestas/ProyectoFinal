package com.dam.ProyectoFinal.Servicios;

import java.util.List;

import com.dam.ProyectoFinal.Entidades.DatosMedicos;

public interface DatosMedicosServiceI {

	public List <DatosMedicos> obtenerDatosMedicos();
	
	public DatosMedicos obtenerPorCodigo(int codigo);
	
	public void insertarDatosMedicos(DatosMedicos datos);
	
	public void actualizarDatosMedicos(DatosMedicos datos);
	
	public void eliminarDatosMedicosPorCodigo(int codigo);
	
	//Un criterio	
	
	public List <DatosMedicos> obtenerPorVacunado(String vacunado);
	
	public List <DatosMedicos> obtenerPorSano(String sano);
	
	public List <DatosMedicos> obtenerPorMicrochip(String microchip);
	
	public List <DatosMedicos> obtenerPorDesparasitado(String desparasitado);
	
	public List <DatosMedicos> obtenerPorEsterilizado(String esterilizado);
	
	
	//Dos criterios
	public List <DatosMedicos> obtenerPorVacunadoAndSano(String vacunado, String sano);
	
	public List <DatosMedicos> obtenerPorVacunadoAndMicrochip(String vacunado, String microchip);
	
	public List <DatosMedicos> obtenerPorVacunadoAndDesparasitado(String vacunado, String desparasitado);
	
	public List <DatosMedicos> obtenerPorVacunadoAndEsterilizado(String vacunado, String esterilizado);
	
	public List <DatosMedicos> obtenerPorSanoAndMicrochip(String sano, String microchip);
	
	public List <DatosMedicos> obtenerPorSanoAndDesparasitado(String sano, String desparasitado);
	
	public List <DatosMedicos> obtenerPorSanoAndEsterilizado(String sano, String esterilizado);
	
	public List <DatosMedicos> obtenerPorMicrochipAndDesparasitado(String microchip, String desparasitado);
	
	public List <DatosMedicos> obtenerPorMicrochipAndEsterilizado(String microchip, String esterilizado);
	
	public List <DatosMedicos> obtenerPorDesparasitadoAndEsterilizado(String desparasitado, String esterilizado);
	
	
	//Tres criterios
	public List <DatosMedicos> obtenerPorVacunadoAndSanoAndMicrochip(String vacunado, String sano, String microchip);
	
	public List <DatosMedicos> obtenerPorVacunadoAndSanoAndDesparasitado(String vacunado, String sano, String desparasitado);
	
	public List <DatosMedicos> obtenerPorVacunadoAndSanoAndEsterilizado(String vacunado, String sano, String esterilizado);
	
	public List <DatosMedicos> obtenerPorVacunadoAndMicrochipAndDesparasitado(String vacunado, String microchip, String desparasitado);
	
	public List <DatosMedicos> obtenerPorVacunadoAndMicrochipAndEsterilizado(String vacunado, String microchip, String esterilizado);
	
	public List <DatosMedicos> obtenerPorVacunadoAndDesparasitadoAndEsterilizado(String vacunado, String desparasitado, String esterilizado);
	
	public List <DatosMedicos> obtenerPorSanoAndMicrochipAndDesparasitado(String sano, String microchip, String desparasitado);
	
	public List <DatosMedicos> obtenerPorSanoAndMicrochipAndEsterilizado(String sano, String microchip, String esterilizado);
	
	public List <DatosMedicos> obtenerPorSanoAndDesparasitadoAndEsterilizado(String sano, String desparasitado, String esterilizado);
	
	public List <DatosMedicos> obtenerPorMicrochipAndDesparasitadoAndEsterilizado(String microchip, String desparasitado, String esterilizado);
	
	
	//Cuatro criterios	
	public List <DatosMedicos> obtenerPorVacunadoAndSanoAndMicrochipAndDesparasitado(String vacunado, String sano, String microchip, String desparasitado);
	
	public List <DatosMedicos> obtenerPorVacunadoAndSanoAndMicrochipAndEsterilizado(String vacunado, String sano, String microchip, String esterilizado);
	
	public List <DatosMedicos> obtenerPorVacunadoAndSanoAndDesparasitadoAndEsterilizado(String vacunado, String sano, String desparasitado, String esterilizado);
	
	public List <DatosMedicos> obtenerPorVacunadoAndMicrochipAndDesparasitadoAndEsterilizado(String vacunado, String microchip, String desparasitado, String esterilizado);
	
	public List <DatosMedicos> obtenerPorSanoAndMicrochipAndDesparasitadoAndEsterilizado(String sano, String microchip, String desparasitado, String esterilizado);
	
	
	//cinco criterios
	
	public List <DatosMedicos> obtenerPorVacunadoAndSanoAndMicrochipAndDesparasitadoAndEsterilizado(String vacunado, String sano, String microchip, String desparasitado, String esterilizado);

}
