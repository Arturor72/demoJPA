package com.example.demoJPA.service;

import java.util.Optional;

import com.example.demoJPA.domain.Usuario;

public interface UsuarioService {
	
	public Optional<Usuario> getUser(Long id);
	
	public Usuario saveUser(Usuario usuario);

}
