package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.servicedesk.entity.Estado;
import com.uisrael.servicedesk.repository.IEstadoRepository;
import com.uisrael.servicedesk.service.IEstadoServices;

@Service
@Component
public class EstadoServicesImpl implements IEstadoServices{
	
	@Autowired
	private IEstadoRepository repoEst;
	@Override
	public void inserEstado(Estado nuevoEstado) {
		// TODO Auto-generated method stub
		repoEst.save(nuevoEstado);
	}

	@Override
	public List<Estado> verEstado() {
		// TODO Auto-generated method stub
		return repoEst.findAll();
	}

	@Override
	public void borrarEstado(Integer id) {
		// TODO Auto-generated method stub
		repoEst.deleteById(id);
	}

	@Override
	public Optional<Estado> editarEstado(Integer id) {
		// TODO Auto-generated method stub
		return repoEst.findById(id);
	}

}
