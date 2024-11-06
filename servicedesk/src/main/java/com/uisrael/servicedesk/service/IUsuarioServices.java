package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Usuario;

public interface IUsuarioServices {
	
	public void insertUsuario(Usuario nuevoUsuario);
	public List<Usuario>verUsuario();
	public void borrarUsuario(Integer id);
	public Optional<Usuario>editarUsuario(Integer id);
}
