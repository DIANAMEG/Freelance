package com.prueba.dev.backend.transportservices.service;

import java.util.List;

import com.prueba.dev.backend.transportservices.model.Usuario;

public interface IUsuarioService<Usuario> {
	
	
	public List<Usuario> findAllUsers();
	
	public Usuario save(Usuario usuario);

}
