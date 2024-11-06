package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Comentario;

public interface IComentarioServices {
	
	public void insertComentario(Comentario nuevoComentario);
	public List<Comentario>verComentario();
	public void borrarComentario(Integer id);
	public Optional<Comentario>editarComentario(Integer id);
}
