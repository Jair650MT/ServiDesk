package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Estado;

public interface IEstadoServices {
	
	public void inserEstado(Estado nuevoEstado);
	public List<Estado>verEstado();
	public void borrarEstado(Integer id);
	public Optional<Estado>editarEstado(Integer id);
	
}
