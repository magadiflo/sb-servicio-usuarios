package com.magadiflo.usuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.magadiflo.usuarios.models.entity.Usuario;

// Indicamos dónde se va a exportar todos los métodos del crud repository: 
// listar, listar por id, crear, modicar, eliminar y método personalizados que tengamos en esta interfaz
// Todo se exporta a nuestra ApiRest de forma automática
@RepositoryRestResource(path = "usuarios") 
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

	Usuario findByUsername(String username);
	
	@Query("SELECT u FROM Usuario AS u WHERE u.username = ?1")
	Usuario obtenerPorUsername(String username);

}
