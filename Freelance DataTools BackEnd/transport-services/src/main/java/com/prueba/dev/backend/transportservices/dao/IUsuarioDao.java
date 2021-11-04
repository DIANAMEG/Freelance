package com.prueba.dev.backend.transportservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prueba.dev.backend.transportservices.model.Usuario;



public interface IUsuarioDao  extends JpaRepository<Usuario, Long>{
	
	
	@Query("from Usuario")
	public List<Usuario> findAllUsers();

}
