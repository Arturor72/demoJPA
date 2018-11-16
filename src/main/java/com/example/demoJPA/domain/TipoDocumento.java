package com.example.demoJPA.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="tipodocumento" )
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
property  = "id", 
scope     = TipoDocumento.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoDocumento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idTipoDocumento")
	private Long id;
	@Column(name="descripcion")
	private String descripcion;

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoDocumento")
	@JsonIgnore
	private List<Usuario> usuarios;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	@Override
	public String toString() {
		return "TipoDocumento [id=" + id + ", descripcion=" + descripcion + ", usuarios=" + usuarios + "]";
	}

}
