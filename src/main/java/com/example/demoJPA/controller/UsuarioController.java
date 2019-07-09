package com.example.demoJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJPA.constants.DemoJpaConstants;
import com.example.demoJPA.domain.Usuario;
import com.example.demoJPA.service.UsuarioService;

@RestController
@RequestMapping(DemoJpaConstants.VERSION_API+"/users")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	
	@GetMapping("/{id}")
	public Usuario getUser(@PathVariable Long id) {
		
		return usuarioService.getUser(id).get();
	}
	
	@PostMapping
	public Usuario saveUser(@RequestBody Usuario usuario) {
		return usuarioService.saveUser(usuario);
	}
}
