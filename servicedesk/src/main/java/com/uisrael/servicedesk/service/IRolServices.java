package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Rol;

public interface IRolServices {
	
	public void inserRol(Rol nuevoRol);
	public List<Rol>verRol();
	public void borrarRol(Integer id);
	public Optional<Rol>editarRol(Integer id);
}
