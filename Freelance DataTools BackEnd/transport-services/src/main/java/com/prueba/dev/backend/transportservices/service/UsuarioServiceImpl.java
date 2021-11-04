package com.prueba.dev.backend.transportservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prueba.dev.backend.transportservices.dao.IUsuarioDao;
import com.prueba.dev.backend.transportservices.model.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService<Usuario>{

	@Autowired
	private IUsuarioDao iusuarioDao;
	
	
	
	@Override
	public List<Usuario> findAllUsers() {
		List<Usuario> listaUsuarios = null; 
		listaUsuarios = iusuarioDao.findAll();
		return listaUsuarios;
	}
	
	@Override
	public Usuario save(Usuario usuario) {
		return iusuarioDao.save(usuario);
	}

}
