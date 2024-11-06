package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Tipo;

public interface ITipoServices {
	
	public void insertTipo(Tipo nuevoTipo);
	public List<Tipo>verTipo();
	public void borrarTipo(Integer id);
	public Optional<Tipo>editarTipo(Integer id);
	
}
