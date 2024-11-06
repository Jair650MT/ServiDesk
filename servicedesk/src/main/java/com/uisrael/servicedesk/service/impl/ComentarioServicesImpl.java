package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.servicedesk.entity.Comentario;
import com.uisrael.servicedesk.repository.IComentarioRepository;
import com.uisrael.servicedesk.service.IComentarioServices;

@Service
@Component
public class ComentarioServicesImpl implements IComentarioServices{
	
	@Autowired
	private IComentarioRepository repoComen;
	@Override
	public void insertComentario(Comentario nuevoComentario) {
		// TODO Auto-generated method stub
		repoComen.save(nuevoComentario);
		
	}

	@Override
	public List<Comentario> verComentario() {
		// TODO Auto-generated method stub
		return repoComen.findAll();
	}

	@Override
	public void borrarComentario(Integer id) {
		// TODO Auto-generated method stub
		repoComen.deleteById(id);
	}

	@Override
	public Optional<Comentario> editarComentario(Integer id) {
		// TODO Auto-generated method stub
		return repoComen.findById(id);
	}

}
