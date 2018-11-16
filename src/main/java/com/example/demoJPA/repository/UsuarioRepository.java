package com.example.demoJPA.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoJPA.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

	
}
