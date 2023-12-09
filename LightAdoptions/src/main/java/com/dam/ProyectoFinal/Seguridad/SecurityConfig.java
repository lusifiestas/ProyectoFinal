package com.dam.ProyectoFinal.Seguridad;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.dam.ProyectoFinal.Servicios.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		return httpSecurity.authorizeHttpRequests(auth -> {
			auth.requestMatchers("/").permitAll();
			//auth.requestMatchers("/admin").authenticated();
			auth.anyRequest().authenticated();
		}).formLogin().loginPage("/login").successHandler(successHandler()) // URL a la que se redirige después del
																			// inicio de sesión exitoso
				.permitAll()
				// .defaultSuccessUrl("/admin")
				.failureUrl("/login?error=true")
				// .usernameParameter("correo")
				// .passwordParameter("contrasenya")
				.and()
				.logout()
					.logoutUrl("/logout")
					.logoutSuccessUrl("/")
				.and()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS) // ALWAYS - IF_REQUIRED -																				// NEVER - STATELESS
				.invalidSessionUrl("/") // Especifica la URL a la cual redirigir al usuario si se detecta una sesión
											// inválida
				.maximumSessions(1)// Permite configurar el número máximo de sesiones permitidas para un usuario.
				.expiredUrl("/") // Especifica la URL a la cual redirigir al usuario si su sesión ha expirado
										// debido a la inactividad.
				.sessionRegistry(sessionRegistry()).and().sessionFixation() // migrateSession() - newSession() - none()
				.migrateSession().and().build();
	}

	@Bean
	public SessionRegistry sessionRegistry() {
		return new SessionRegistryImpl();
	}

	public AuthenticationSuccessHandler successHandler() {
		return ((request, response, authentication) -> {
			if(authentication!=null) {
				if(authentication.getAuthorities().size()>0) {
					// Obtener un iterador para la lista
			        Iterator<GrantedAuthority> iterator = (Iterator<GrantedAuthority>) authentication.getAuthorities().iterator();
			        // Iterar sobre la lista utilizando el iterador
			        while (iterator.hasNext()) {
			            GrantedAuthority authority = iterator.next();
			            if(authority.getAuthority().equals("ROLE_ADMIN")) {
			            	response.sendRedirect("/admin");
			            }else {
			            	response.sendRedirect("/user");
			            }
			        }
				}
			}
		});
	}

	BCryptPasswordEncoder bCryptPasswordEncoder;

	// Crea el encriptador de contraseñas
	// @Bean <----- COMENTADO PARA QUE FUNCIONE !!!!!
	public BCryptPasswordEncoder passwordEncoder() {
		bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
//El numero 4 representa que tan fuerte quieres la encriptacion.
//Se puede en un rango entre 4 y 31. 
//Si no pones un numero el programa utilizara uno aleatoriamente cada vez
//que inicies la aplicacion, por lo cual tus contrasenas encriptadas no funcionaran bien
		return bCryptPasswordEncoder;
	}

//   @Autowired
//   public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//	   auth.inMemoryAuthentication()
//       .withUser("user").password("{noop}1234").roles("USER")
//       .and()
//       .withUser("admin").password("{noop}1234").roles("ADMIN");
//    }

	@Autowired
	UserDetailsServiceImpl userDetailsService;

	// Registra el service para usuarios y el encriptador de contrasena
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// Setting Service to find User in the database.
		// And Setting PassswordEncoder
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
}
