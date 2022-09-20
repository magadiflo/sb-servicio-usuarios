package com.magadiflo.usuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.magadiflo.usuarios.models.entity.Usuario;

// Indicamos dónde se va a exportar todos los métodos del crud repository: 
// listar, listar por id, crear, modicar, eliminar y método personalizados que tengamos en esta interfaz
// Todo se exporta a nuestra ApiRest de forma automática
@RepositoryRestResource(path = "usuarios") 
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {
	
	/**
	 * El path que se usa a partir de estos métodos incluirá siempre el /search
	 * Ejemplo:
	 * http://127.0.0.1:8090/api/usuarios/usuarios/search/buscar-username?username=magadiflo
	 */

	@RestResource(path = "buscar-username")
	Usuario findByUsername(@Param("username") String username);
	
	/***
	 * Este método como no se usó la anotación @RestResource como en el método anterior,
	 * por defecto usará el nombre tal cual del método: obtenerPorUsername, para formar
	 * parte de la URL. Pero tambíen se podría personalizar como en el método anterior
	 * usando la anotación @RestResource
	 */
	@Query("SELECT u FROM Usuario AS u WHERE u.username = ?1")
	Usuario obtenerPorUsername(String username);

}
