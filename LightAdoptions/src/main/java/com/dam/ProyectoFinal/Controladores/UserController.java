package com.dam.ProyectoFinal.Controladores;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dam.ProyectoFinal.Entidades.Usuario;
import com.dam.ProyectoFinal.Repositorios.UsuarioRepo;
import com.dam.ProyectoFinal.Servicios.UsuarioServiceImpl; 

@RestController
//@Controller
@RequestMapping("/auth") 
public class UserController {
	@Autowired
	private UsuarioRepo repository;
	
	@Autowired
    private UsuarioServiceImpl service; 
  
    /*@Autowired
    private JwtService jwtService;*/
    
    /*@Autowired
    private AuthenticationManager authenticationManager; */
  
    /*@GetMapping("/welcome") 
    public String welcome() { 
        return "Welcome this endpoint is not secure"; 
    } */
  
    @PostMapping("/addNewUser") 
    public String addNewUser(@RequestBody Usuario usuario) { 
        return service.addUser(usuario); 
    } 
    
    @GetMapping("/user/userProfile") 
    @PreAuthorize("hasAuthority('ROLE_USER')") 
    public String userProfile() { 
        return "user"; 
    } 
    
    @GetMapping("/admin/adminProfile") 
    @PreAuthorize("hasAuthority('ROLE_ADMIN')") 
    public String adminProfile() { 
        return "admin"; 
    } 
    

    /*@PostMapping("/generateToken") 
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) { 
    	//A LO MEJOR HAY QUE CODIFICAR DE ALGUNA FORMA LA CONTRASEÑA AUNQUE SE SUPONE QUE LO ESTA HACIENDO DE FORMA AUTOMATICA
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getCorreo(), authRequest.getContrasenya())); 
        if (authentication.isAuthenticated()) { 
            return jwtService.generateToken(authRequest.getCorreo());
        } else { 
            throw new UsernameNotFoundException("invalid user request !"); 
        }
    }*/
    
    /*@PostMapping("/generateToken") 
    public ResponseEntity<String> authenticateAndGetToken(@RequestBody AuthRequest authRequest) { 
    	//A LO MEJOR HAY QUE CODIFICAR DE ALGUNA FORMA LA CONTRASEÑA AUNQUE SE SUPONE QUE LO ESTA HACIENDO DE FORMA AUTOMATICA
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getCorreo(), authRequest.getContrasenya())); 
        if (authentication.isAuthenticated()) { 
        	String token = jwtService.generateToken(authRequest.getCorreo());
            String redirectURL = redireccionamientoUser(authRequest.getCorreo());
            HttpHeaders headers = new HttpHeaders();
            headers.add("Authorization", "Bearer " + token);
            return ResponseEntity.status(HttpStatus.FOUND)
                .headers(headers)
                .location(URI.create(redirectURL))
                .body(null);
        } else { 
            throw new UsernameNotFoundException("invalid user request !"); 
        } 
    }
    
    public String redireccionamientoUser(String correo) {
    	String redireccion="";

    	Usuario auxUser=repository.findUserByCorreo(correo);//encuentro el usuario con ese correo para averiguar su tipo
    	
    	if(auxUser.getTipo().equalsIgnoreCase("ROLE_ADMIN")) {
    		//entonces es administracion y hace la redireccion a /user/userProfile
    		redireccion="/admin/adminProfile";
    	}else {
    		//entonces es un user normal y corriente
    		redireccion="/user/userProfile";
    	}
    	
    	return redireccion;
    }*/
}
