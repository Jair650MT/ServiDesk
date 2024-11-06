package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.servicedesk.entity.Proyecto;
import com.uisrael.servicedesk.repository.IProyectoRepository;
import com.uisrael.servicedesk.service.IProyectoServices;

@Service
@Component
public class ProyectoServicesImpl implements IProyectoServices{
	
	@Autowired
	private IProyectoRepository repoPro;
	@Override
	public void insertProyecto(Proyecto nuevoProyecto) {
		// TODO Auto-generated method stub
		repoPro.save(nuevoProyecto);
	}

	@Override
	public List<Proyecto> verProyectp() {
		// TODO Auto-generated method stub
		return repoPro.findAll();
	}

	@Override
	public void borrarProyecto(Integer id) {
		// TODO Auto-generated method stub
		repoPro.deleteById(id);
	}

	@Override
	public Optional<Proyecto> editarProyecto(Integer id) {
		// TODO Auto-generated method stub
		return repoPro.findById(id);
	}

}
