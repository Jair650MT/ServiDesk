package com.uisrael.servicedesk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.uisrael.servicedesk.entity.Rol;
import com.uisrael.servicedesk.entity.Usuario;
import com.uisrael.servicedesk.service.IRolServices;
import com.uisrael.servicedesk.service.IUsuarioServices;

@Controller
public class UsuarioController {
	
	@Autowired
	private IUsuarioServices servUsuario;
	@Autowired
	private IRolServices servRol;
	@GetMapping("/usuarios")
	private String verUsuarios(Model model) {
		List<Usuario>listaUsuario=servUsuario.verUsuario();
		model.addAttribute("listaUsuarios",listaUsuario);
		return "/Usuario/listaUsuarios";
	}
	
	@GetMapping("/usuarios/nuevo")
	private String nuevoUsuario(Model model) {
		model.addAttribute("nuevoUsuario",new Usuario());
		List<Rol>listaRol=servRol.verRol();
		model.addAttribute("listaRoles", listaRol);
		return"/Usuario/nuevoUsuario";
	}
	@PostMapping("/usuarios/guardar")
	private String guardarUsuario(@ModelAttribute("nuevoUsuario") Usuario nuevo) {
		servUsuario.insertUsuario(nuevo);
		return"redirect:/usuarios";
	}
	@GetMapping("/borrar/{id}")
	private String borrarUsuario(@PathVariable("id") Integer idObjeto) {
		servUsuario.borrarUsuario(idObjeto);
		return"redirect:/usuarios";
	}
	@GetMapping("/editar/{id}")
	private String editarUsuario(@PathVariable("id") Integer idObjeto, Model model) {
		model.addAttribute("nuevoUsuario",servUsuario.editarUsuario(idObjeto));
		return "/Usuario/nuevoUsuario";
	}
	
}
