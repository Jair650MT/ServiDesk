package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.servicedesk.entity.Rol;
import com.uisrael.servicedesk.repository.IRolRepository;
import com.uisrael.servicedesk.service.IRolServices;

@Service
@Component
public class RolServicesImpl implements IRolServices{
	@Autowired
	private IRolRepository repoRol;
	@Override
	public void inserRol(Rol nuevoRol) {
		// TODO Auto-generated method stub
		repoRol.save(nuevoRol);
	}

	@Override
	public List<Rol> verRol() {
		// TODO Auto-generated method stub
		return repoRol.findAll();
	}

	@Override
	public void borrarRol(Integer id) {
		// TODO Auto-generated method stub
		repoRol.deleteById(id);
	}

	@Override
	public Optional<Rol> editarRol(Integer id) {
		// TODO Auto-generated method stub
		return repoRol.findById(id);
	}

}
