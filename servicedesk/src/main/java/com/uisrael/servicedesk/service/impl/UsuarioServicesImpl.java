package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.servicedesk.entity.Usuario;
import com.uisrael.servicedesk.repository.IUsuarioRepository;
import com.uisrael.servicedesk.service.IUsuarioServices;

@Service
@Component
public class UsuarioServicesImpl implements IUsuarioServices{
	@Autowired
	private IUsuarioRepository repoUsuario;
	@Override
	public void insertUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		repoUsuario.save(nuevoUsuario);
	}

	@Override
	public List<Usuario> verUsuario() {
		// TODO Auto-generated method stub
		return repoUsuario.findAll();
	}

	@Override
	public void borrarUsuario(Integer id) {
		// TODO Auto-generated method stub
		repoUsuario.deleteById(id);
	}

	@Override
	public Optional<Usuario> editarUsuario(Integer id) {
		// TODO Auto-generated method stub
		return repoUsuario.findById(id);
	}

}
