package com.dam.ProyectoFinal.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dam.ProyectoFinal.Entidades.DatosMedicos;

public interface DatosMedicosRepo extends JpaRepository<DatosMedicos, Integer>{

	//Un criterio	
	DatosMedicos findByCodigo(int codigo);
	
	List <DatosMedicos> findByVacunado(String vacunado);
	
	List <DatosMedicos> findBySano(String sano);
	
	List <DatosMedicos> findByMicrochip(String microchip);
	
	List <DatosMedicos> findByDesparasitado(String desparasitado);
	
	List <DatosMedicos> findByEsterilizado(String esterilizado);
	
	
	//Dos criterios
	List <DatosMedicos> findByVacunadoAndSano(String vacunado, String sano);
	
	List <DatosMedicos> findByVacunadoAndMicrochip(String vacunado, String microchip);
	
	List <DatosMedicos> findByVacunadoAndDesparasitado(String vacunado, String desparasitado);
	
	List <DatosMedicos> findByVacunadoAndEsterilizado(String vacunado, String esterilizado);
	
	List <DatosMedicos> findBySanoAndMicrochip(String sano, String microchip);
	
	List <DatosMedicos> findBySanoAndDesparasitado(String sano, String desparasitado);
	
	List <DatosMedicos> findBySanoAndEsterilizado(String sano, String esterilizado);
	
	List <DatosMedicos> findByMicrochipAndDesparasitado(String microchip, String desparasitado);
	
	List <DatosMedicos> findByMicrochipAndEsterilizado(String microchip, String esterilizado);
	
	List <DatosMedicos> findByDesparasitadoAndEsterilizado(String desparasitado, String esterilizado);
	
	
	//Tres criterios
	List <DatosMedicos> findByVacunadoAndSanoAndMicrochip(String vacunado, String sano, String microchip);
	
	List <DatosMedicos> findByVacunadoAndSanoAndDesparasitado(String vacunado, String sano, String desparasitado);
	
	List <DatosMedicos> findByVacunadoAndSanoAndEsterilizado(String vacunado, String sano, String esterilizado);
	
	List <DatosMedicos> findByVacunadoAndMicrochipAndDesparasitado(String vacunado, String microchip, String desparasitado);
	
	List <DatosMedicos> findByVacunadoAndMicrochipAndEsterilizado(String vacunado, String microchip, String esterilizado);
	
	List <DatosMedicos> findByVacunadoAndDesparasitadoAndEsterilizado(String vacunado, String desparasitado, String esterilizado);
	
	List <DatosMedicos> findBySanoAndMicrochipAndDesparasitado(String sano, String microchip, String desparasitado);
	
	List <DatosMedicos> findBySanoAndMicrochipAndEsterilizado(String sano, String microchip, String esterilizado);
	
	List <DatosMedicos> findBySanoAndDesparasitadoAndEsterilizado(String sano, String desparasitado, String esterilizado);
	
	List <DatosMedicos> findByMicrochipAndDesparasitadoAndEsterilizado(String microchip, String desparasitado, String esterilizado);
	
	
	//Cuatro criterios	
	List <DatosMedicos> findByVacunadoAndSanoAndMicrochipAndDesparasitado(String vacunado, String sano, String microchip, String desparasitado);
	
	List <DatosMedicos> findByVacunadoAndSanoAndMicrochipAndEsterilizado(String vacunado, String sano, String microchip, String esterilizado);
	
	List <DatosMedicos> findByVacunadoAndSanoAndDesparasitadoAndEsterilizado(String vacunado, String sano, String desparasitado, String esterilizado);
	
	List <DatosMedicos> findByVacunadoAndMicrochipAndDesparasitadoAndEsterilizado(String vacunado, String microchip, String desparasitado, String esterilizado);
	
	List <DatosMedicos> findBySanoAndMicrochipAndDesparasitadoAndEsterilizado(String sano, String microchip, String desparasitado, String esterilizado);
	
	
	//cinco criterios
	
	List <DatosMedicos> findByVacunadoAndSanoAndMicrochipAndDesparasitadoAndEsterilizado(String vacunado, String sano, String microchip, String desparasitado, String esterilizado);
}
