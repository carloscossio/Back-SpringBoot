package com.misionTIC2022.grupo29.equipo8.cadena.tienda.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.misionTIC2022.grupo29.equipo8.cadena.tienda.model.Usuario;
import com.misionTIC2022.grupo29.equipo8.cadena.tienda.repository.UsuarioRepository;

@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")

public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAllUsuarios(@RequestParam(required = false) String username) {
		try {
			List<Usuario> usuarios = new ArrayList<Usuario>();
			
			if (username == null) {
				usuarioRepository.findAll().forEach(usuarios::add);
			}else {
				usuarioRepository.findByUsername(username).forEach(usuarios::add);
			}
			
			if (usuarios.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(usuarios, HttpStatus.OK);	
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
