package com.dam.ProyectoFinal.Servicios;

import java.util.List;

import com.dam.ProyectoFinal.Entidades.Usuario;

/**
 * 
 * Servicio de usuario
 *
 */
public interface UsuarioServiceI {
	/**
	 * Obtiene una lista de todos los usuarios
	 * 
	 * @return lista de objetos usuario
	 */
	public List<Usuario> obtenerUsuarios();

	/**
	 * Obtiene un usuario buscandolo por correo, que es pasado por argumento
	 * @param correo correo por el que se busca al usuario
	 * @return objeto usuario
	 */
	public Usuario obtenerPorCorreo(String correo);

	/**
	 * Inserta un empleado a la base de datos
	 * @param user objeto usuario a insertar
	 */
	public void insertarUsuario(Usuario user);

	/**
	 * Actualiza un usuario en la base de datos
	 * @param user objeto usuario a actualizar
	 */
	public void actualizarUsuario(Usuario user);

	/**
	 * elimina un usuario de la base de datos
	 * @param correo correo por el que se busca el usuario al que eliminar
	 */
	public void eliminarUsuarioPorCorreo(String correo);

	//un criterio
	
	/**
	 * Obtiene una lista de todos los usuarios que tenga el nombre recibido por argumentos
	 * @param nombre nombre por el que se busca a los usuarios
	 * @return devuelve una lista de usuarios
	 */
	public List<Usuario> ObtenerPorNombre(String nombre);

	/**
	 * Obtiene una lista de usuarios que residan en la ciudad recibida por parametros
	 * @param ciudad ciudad por la que se busca a los usuarios
	 * @return devuelve una lista de usuarios
	 */
	public List<Usuario> ObtenerPorCiudad(String ciudad);

	/**
	 * Obtiene una lista de usuarios segun el tipo
	 * @param tipo variable por la que se va a buscar a los usuarios segun el tipo que sean
	 * @return devuelve una lista de usuarios
	 */
	public List<Usuario> ObtenerPorTipo(String tipo);

	// Dos criterios
	
	/**
	 * Obtiene una lista de usuarios por nombre y ciudad
	 * @param nombre nombre por el que se va a buscar a los usuarios
	 * @param ciudad ciudad por el que se va a buscar a los usuarios
	 * @return devuelve una lista de usuarios
	 */
	public List<Usuario> ObtenerPorNombreAndCiudad(String nombre, String ciudad);

	/**
	 * Obtiene una lista de usuarios por nombre y tipo
	 * @param nombre nombre por el que se va a buscar a los usuarios
	 * @param tipo tipo de usuario
	 * @return devuelve una lista de usuarios
	 */
	public List<Usuario> ObtenerPorNombreAndTipo(String nombre, String tipo);

	/**
	 * Obtiene una lista de usuarios segun ciudad y tipo
	 * @param ciudad ciudad por la que se va a buscar a los usuarios
	 * @param tipo tipo de usuario
	 * @return devuelve una lista de usuarios
	 */
	public List<Usuario> ObtenerPorCiudadAndTipo(String ciudad, String tipo);

	// Tres criterios
	
	/**
	 * Obtiene una lista de usuarios segun nombre, ciudad y tipo
	 * @param nombre nombre por el que se va a buscar a los usuarios
	 * @param ciudad ciudad por la que se va a buscar a los usuarios
	 * @param tipo tipo de usuario
	 * @return devuelve una lista de usuarios
	 */
	public List<Usuario> ObtenerPorNombreAndCiudadAndTipo(String nombre, String ciudad, String tipo);

}
