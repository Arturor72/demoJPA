package com.example.demoJPA.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJPA.domain.TipoDocumento;
import com.example.demoJPA.repository.TipoDocumentoRepository;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

	@Autowired
	TipoDocumentoRepository tipoDocumentoRepository;
	
	@Override
	public Optional<TipoDocumento> getTipoDocumento(Long id){
		return tipoDocumentoRepository.findById(id);
	}
}
