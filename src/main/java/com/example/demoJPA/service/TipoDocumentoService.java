package com.example.demoJPA.service;

import java.util.Optional;

import com.example.demoJPA.domain.TipoDocumento;

public interface TipoDocumentoService {
	
	public Optional<TipoDocumento> getTipoDocumento(Long id);

}
