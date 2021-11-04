package com.prueba.dev.backend.transportservices.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.dev.backend.transportservices.model.Usuario;
import com.prueba.dev.backend.transportservices.service.IUsuarioService;


@CrossOrigin(origins= {"http://localhost:4200","*"})
@RestController
@RequestMapping("/api")
public class TransportServiceController {
	
	
	@Autowired
	private IUsuarioService<Usuario> usuarioService;
	
	@GetMapping("/usuarios")
	public ResponseEntity<?>getAllUsers(){
		
		List<Usuario> listusuarios = null;
		Map<String,Object> response = new HashMap<>();
		
		try {
			listusuarios = usuarioService.findAllUsers();
			System.out.println("lista"+listusuarios);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al consultar en la base de datos ");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>( response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(listusuarios == null) {
			response.put("mensaje", "No se encontraron resultados");
			return new ResponseEntity<Map<String,Object>>( response, HttpStatus.NOT_FOUND);
		}
		
		response.put("usuarios", listusuarios);
		return new ResponseEntity<Map<String,Object>>( response, HttpStatus.OK);
		
	}
	
	
	@PostMapping("/usuarios")
	public ResponseEntity<?> create(@Valid @RequestBody Usuario usuario, BindingResult result) {
		Usuario usuarioNew = null;
		Map<String,Object> response =new HashMap<String, Object>();
		
		if(result.hasErrors()) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err-> "El campo '"+ err.getField() + "' " + err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String,Object>>( response, HttpStatus.BAD_REQUEST);
		}
		
		try {
			usuarioNew = usuarioService.save(usuario);
			
		} catch (DataAccessException e) {
			response.put("mensaje", "Error en la cracion del usuario en la BD ");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>( response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
			response.put("mensaje", "El usuario se ha creado con exito");
			response.put("usuario", usuarioNew);
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);
	}

}
