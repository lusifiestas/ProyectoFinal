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
	List <DatosMedicos> findByVacunadoSano(String vacunado, String sano);
	
	List <DatosMedicos> findByVacunadoMicrochip(String vacunado, String microchip);
	
	List <DatosMedicos> findByVacunadoDesparasitado(String vacunado, String desparasitado);
	
	List <DatosMedicos> findByVacunadoEsterilizado(String vacunado, String esterilizado);
	
	List <DatosMedicos> findBySanoMicrochip(String sano, String microchip);
	
	List <DatosMedicos> findBySanoDesparasitado(String sano, String desparasitado);
	
	List <DatosMedicos> findBySanoEsterilizado(String sano, String esterilizado);
	
	List <DatosMedicos> findByMicrochipDesparasitado(String microchip, String desparasitado);
	
	List <DatosMedicos> findByMicrochipEsterilizado(String microchip, String esterilizado);
	
	List <DatosMedicos> findByDesparasitadoEsterilizado(String desparasitado, String esterilizado);
	
	
	//Tres criterios
	List <DatosMedicos> findByVacunadoSanoMicrochip(String vacunado, String sano, String microchip);
	
	List <DatosMedicos> findByVacunadoSanoDesparasitado(String vacunado, String sano, String desparasitado);
	
	List <DatosMedicos> findByVacunadoSanoEsterilizado(String vacunado, String sano, String esterilizado);
	
	List <DatosMedicos> findByVacunadoMicrochipDesparasitado(String vacunado, String microchip, String desparasitado);
	
	List <DatosMedicos> findByVacunadoMicrochipEsterilizado(String vacunado, String microchip, String esterilizado);
	
	List <DatosMedicos> findByVacunadoDesparasitadoEsterilizado(String vacunado, String desparasitado, String esterilizado);
	
	List <DatosMedicos> findBySanoMicrochipDesparasitado(String sano, String microchip, String desparasitado);
	
	List <DatosMedicos> findBySanoMicrochipEsterilizado(String sano, String microchip, String desparasitado);
	
	List <DatosMedicos> findBySanoDesparasitadoEsterilizado(String sano, String desparasitado, String esterilizado);
	
	List <DatosMedicos> findByMicrochipDesparasitadoEsterilizado(String microchip, String desparasitado, String esterilizado);
	
	
	//Cuatro criterios	
	List <DatosMedicos> findByVacunadoSanoMicrochipDesparasitado(String vacunado, String sano, String microchip, String desparasitado);
	
	List <DatosMedicos> findByVacunadoSanoMicrochipEsterilizado(String vacunado, String sano, String microchip, String esterilizado);
	
	List <DatosMedicos> findByVacunadoSanoDesparasitadoEsterilizado(String vacunado, String sano, String desparasitado, String esterilizado);
	
	List <DatosMedicos> findByVacunadoMicrochipDesparasitadoEsterilizado(String vacunado, String microchip, String desparasitado, String esterilizado);
	
	List <DatosMedicos> findBySanoMicrochipDesparasitadoEsterilizado(String sano, String microchip, String desparasitado, String esterilizado);
	
	
	//cinco criterios
	
	List <DatosMedicos> findByVacunadoSanoMicrochipDesparasitadoEsterilizado(String vacunado, String sano, String microchip, String desparasitado, String esterilizado);
}
