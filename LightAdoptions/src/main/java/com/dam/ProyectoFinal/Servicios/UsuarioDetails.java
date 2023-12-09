package com.dam.ProyectoFinal.Servicios;
import com.dam.ProyectoFinal.Entidades.Usuario;
import org.springframework.security.core.GrantedAuthority; 
import org.springframework.security.core.authority.SimpleGrantedAuthority; 
import org.springframework.security.core.userdetails.UserDetails; 

import java.util.Arrays; 
import java.util.Collection; 
import java.util.List; 
import java.util.stream.Collectors; 

public class UsuarioDetails implements UserDetails{
	private String correo; 
    private String contrasenya; 
    private List<GrantedAuthority> authorities; 
    
    public UsuarioDetails(Usuario usuario) {
    	correo = usuario.getCorreo();
    	contrasenya = usuario.getContrasenya();
    	authorities = Arrays.stream(usuario.getTipo().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { 
        return authorities; 
    } 
  
    @Override
    public String getPassword() { 
        return contrasenya; 
    } 
  
    @Override
    public String getUsername() { 
        return correo; 
    } 
  
    @Override
    public boolean isAccountNonExpired() { 
        return true; 
    } 
  
    @Override
    public boolean isAccountNonLocked() { 
        return true; 
    } 
  
    @Override
    public boolean isCredentialsNonExpired() { 
        return true; 
    } 
  
    @Override
    public boolean isEnabled() { 
        return true; 
    } 
}
