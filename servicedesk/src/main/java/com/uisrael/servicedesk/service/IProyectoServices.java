package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Proyecto;

public interface IProyectoServices {
	
	public void insertProyecto(Proyecto nuevoProyecto);
	public List<Proyecto>verProyectp();
	public void borrarProyecto(Integer id);
	public Optional<Proyecto>editarProyecto(Integer id);
}
