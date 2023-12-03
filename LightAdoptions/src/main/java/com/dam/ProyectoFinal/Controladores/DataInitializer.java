package com.dam.ProyectoFinal.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.dam.ProyectoFinal.Entidades.Usuario;
import com.dam.ProyectoFinal.Repositorios.UsuarioRepo;

@Component
public class DataInitializer implements CommandLineRunner {
	private final UsuarioRepo repository;
	private final PasswordEncoder passwordEncoder;

	@Autowired
	public DataInitializer(UsuarioRepo repository, PasswordEncoder passwordEncoder) {
		this.repository = repository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public void run(String... args) throws Exception {
        // Verificar si el usuario administrador ya existe en la base de datos
		if(!repository.existsById("admin@gmail.com")) {
			//si no existe entonces es cuando lo creo de forma automatica
			Usuario adminUser=new Usuario();
			adminUser.setCorreo("admin@gmail.com");
			adminUser.setContrasenya(passwordEncoder.encode("ContrasenyaAdmin"));
			
			//asigno el rol siguiendo los estandares
            adminUser.setTipo("ROLE_ADMIN");
            
            //asigno algo al resto de atributos aunque no son necesarios       
            adminUser.setBiografia(" ");
            adminUser.setCiudad(" ");
            adminUser.setFotoPerfil(" ");
            adminUser.setNombre("admin");
            
            //Guardo el usuario en la bd una vez esta todo asignado
            repository.save(adminUser);
            
		}
	}

}
