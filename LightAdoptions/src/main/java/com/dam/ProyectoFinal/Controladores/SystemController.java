package com.dam.ProyectoFinal.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador principal de vistas.
 *
 */
@Controller
@RequestMapping("*")
public class SystemController {
	/**
	 * Redireccionamiento principal
	 * @return login.html
	 */
	//@GetMapping("/login")
	@GetMapping({"/","/login"})
	public String showLogin() {	
		return "login";
	}
	
	
}
