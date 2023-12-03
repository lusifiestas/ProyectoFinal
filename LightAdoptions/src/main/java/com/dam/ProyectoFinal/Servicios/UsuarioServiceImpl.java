package com.dam.ProyectoFinal.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dam.ProyectoFinal.Entidades.Usuario;
import com.dam.ProyectoFinal.Repositorios.UsuarioRepo; 

@Service
public class UsuarioServiceImpl implements UserDetailsService, UsuarioServiceI{
	@Autowired
    private UsuarioRepo repository; 
  
    @Autowired
    private PasswordEncoder encoder;
    
    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException { 
  
        Optional<Usuario> userDetail = repository.findByCorreo(correo); 
  
        // Transformo usuarioDetails en userDetails
        return userDetail.map(UsuarioDetails::new) 
                .orElseThrow(() -> new UsernameNotFoundException("User not found " + correo)); 
    } 
    
    //este metodo añade un usuario cuando se crea en el registro
    public String addUser(Usuario usuario) { 
        usuario.setContrasenya(encoder.encode(usuario.getContrasenya())); 
        repository.save(usuario); 
        return "User Added Successfully"; 
    }

	@Override
	public List<Usuario> obtenerUsuarios() {
		return repository.findAll();
	}

	@Override
	public Usuario obtenerPorCorreo(String correo) {
		return repository.findUserByCorreo(correo);
	}

	//no se que hacer con este metodo puesto que esta añadido arriba sin necesidad de la clase UsuarioServiceI
	@Override
	public void insertarUsuario(Usuario user) {
		
	}

	@Override
	public void actualizarUsuario(Usuario user) {
		repository.save(user);
	}

	@Override
	public void eliminarUsuarioPorCorreo(String correo) {
		repository.deleteById(correo);
	}

	@Override
	public List<Usuario> ObtenerPorNombre(String nombre) {
		return repository.findByNombre(nombre);
	}

	@Override
	public List<Usuario> ObtenerPorCiudad(String ciudad) {
		return repository.findByCiudad(ciudad);
	}

	@Override
	public List<Usuario> ObtenerPorTipo(String tipo) {
		return repository.findByTipo(tipo);
	}

	@Override
	public List<Usuario> ObtenerPorNombreAndCiudad(String nombre, String ciudad) {
		return repository.findByNombreAndCiudad(nombre, ciudad);
	}

	@Override
	public List<Usuario> ObtenerPorNombreAndTipo(String nombre, String tipo) {
		return repository.findByNombreAndTipo(nombre, tipo);
	}

	@Override
	public List<Usuario> ObtenerPorCiudadAndTipo(String ciudad, String tipo) {
		return repository.findByCiudadAndTipo(ciudad, tipo);
	}

	@Override
	public List<Usuario> ObtenerPorNombreAndCiudadAndTipo(String nombre, String ciudad, String tipo) {
		return repository.findByNombreAndCiudadAndTipo(nombre, ciudad, tipo);
	}
    
    
}
