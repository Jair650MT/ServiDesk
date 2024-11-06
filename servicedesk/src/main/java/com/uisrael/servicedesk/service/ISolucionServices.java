package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Solucion;

public interface ISolucionServices {
	
	public void insertSolucion(Solucion nuevaSolucion);
	public List<Solucion>verSolucion();
	public void borrarSolucion(Integer id);
	public Optional<Solucion>editarSolucion(Integer id);
}
