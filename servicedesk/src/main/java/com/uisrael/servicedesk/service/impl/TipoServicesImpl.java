package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.uisrael.servicedesk.entity.Tipo;
import com.uisrael.servicedesk.repository.ITipoRepository;
import com.uisrael.servicedesk.service.ITipoServices;

@Repository
@Component
public class TipoServicesImpl implements ITipoServices{
	
	@Autowired
	private ITipoRepository repoTipo;
	@Override
	public void insertTipo(Tipo nuevoTipo) {
		// TODO Auto-generated method stub
		repoTipo.save(nuevoTipo);
	}

	@Override
	public List<Tipo> verTipo() {
		// TODO Auto-generated method stub
		return repoTipo.findAll();
	}

	@Override
	public void borrarTipo(Integer id) {
		// TODO Auto-generated method stub
		repoTipo.deleteById(id);
	}

	@Override
	public Optional<Tipo> editarTipo(Integer id) {
		// TODO Auto-generated method stub
		return repoTipo.findById(id);
	}

}
