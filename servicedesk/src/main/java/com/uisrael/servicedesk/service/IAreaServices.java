package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Area;

public interface IAreaServices {
	
	public void insertArea(Area nuevaArea);
	public List<Area>verAreas();
	public void borrarArea(Integer id);
	public Optional<Area>editarArea(Integer id);
}
