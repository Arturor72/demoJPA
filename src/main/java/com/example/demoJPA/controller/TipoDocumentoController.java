package com.example.demoJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJPA.constants.DemoJpaConstants;
import com.example.demoJPA.domain.TipoDocumento;
import com.example.demoJPA.service.TipoDocumentoService;

@RestController
@RequestMapping(DemoJpaConstants.VERSION_API+"/tipo-documento")

public class TipoDocumentoController {
	
	@Autowired
	TipoDocumentoService tipoDocumentoService;
	
	@GetMapping("/{id}")
	public TipoDocumento getTipoDocumento(@PathVariable Long id) {
		return tipoDocumentoService.getTipoDocumento(id).get();
	}

}
