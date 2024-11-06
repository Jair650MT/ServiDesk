package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.servicedesk.entity.Categoria;
import com.uisrael.servicedesk.repository.ICategoriaRepository;
import com.uisrael.servicedesk.service.ICategoriaServices;

@Service
@Component
public class CategoriaServicesImpl implements ICategoriaServices{
	
	@Autowired
	private ICategoriaRepository repoCat;
	@Override
	public void insertCategoria(Categoria nuevaCategoria) {
		// TODO Auto-generated method stub
		repoCat.save(nuevaCategoria);
		
	}

	@Override
	public List<Categoria> verCategoria() {
		// TODO Auto-generated method stub
		return repoCat.findAll();
	}

	@Override
	public void borrarCategoria(Integer id) {
		// TODO Auto-generated method stub
		repoCat.deleteById(id);
		
	}

	@Override
	public Optional<Categoria> editarCategoria(Integer id) {
		// TODO Auto-generated method stub
		return repoCat.findById(id);
	}

}
