/**
 * 
 */
package com.platzi.ereservation.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;

import java.util.List;

/**
 * Interface para definir las operciones de base de datos relacionadas con cliente.
 * @author claudio
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	/**
	 * Definicion de metodo para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacion(String identificacionCli);

}
