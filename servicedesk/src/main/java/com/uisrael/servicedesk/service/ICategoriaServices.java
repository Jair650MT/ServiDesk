package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Categoria;

public interface ICategoriaServices {
	
	public void insertCategoria(Categoria nuevaCategoria);
	public List<Categoria>verCategoria();
	public void borrarCategoria(Integer id);
	public Optional<Categoria>editarCategoria(Integer id);
	
}
