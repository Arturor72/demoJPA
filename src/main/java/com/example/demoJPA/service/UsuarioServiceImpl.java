package com.example.demoJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJPA.domain.Usuario;
import com.example.demoJPA.repository.UsuarioRepository;

import java.util.Optional;
@Service
public class UsuarioServiceImpl  implements UsuarioService{

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public Optional<Usuario> getUser(Long id){
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario saveUser(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}
	
	
	
}
