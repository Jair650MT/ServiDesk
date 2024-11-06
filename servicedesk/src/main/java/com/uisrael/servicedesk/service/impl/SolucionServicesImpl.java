package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.servicedesk.entity.Solucion;
import com.uisrael.servicedesk.repository.ISolucionRepository;
import com.uisrael.servicedesk.service.ISolucionServices;

@Service
@Component
public class SolucionServicesImpl implements ISolucionServices{
	
	@Autowired
	private ISolucionRepository repoSolu;
	@Override
	public void insertSolucion(Solucion nuevaSolucion) {
		// TODO Auto-generated method stub
		repoSolu.save(nuevaSolucion);
	}

	@Override
	public List<Solucion> verSolucion() {
		// TODO Auto-generated method stub
		return repoSolu.findAll();
	}

	@Override
	public void borrarSolucion(Integer id) {
		// TODO Auto-generated method stub
		repoSolu.deleteById(id);
	}

	@Override
	public Optional<Solucion> editarSolucion(Integer id) {
		// TODO Auto-generated method stub
		return repoSolu.findById(id);
	}

}
