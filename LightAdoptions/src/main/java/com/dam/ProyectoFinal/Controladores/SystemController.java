package com.dam.ProyectoFinal.Controladores;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador principal de vistas.
 *
 */
@Controller
//@RequestMapping("*")
public class SystemController {

	@GetMapping("/prueba")
	public String showPrueba() {
		return "prueba";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')") 
	public String showAdmin() {
		return "admin";
	}

	@GetMapping("/user")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String showUser() {
		return "user";
	}

}
