package com.magadiflo.usuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.magadiflo.usuarios.models.entity.Usuario;

public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

	Usuario findByUsername(String username);
	
	@Query("SELECT u FROM Usuario AS u WHERE u.username = ?1")
	Usuario obtenerPorUsername(String username);

}
