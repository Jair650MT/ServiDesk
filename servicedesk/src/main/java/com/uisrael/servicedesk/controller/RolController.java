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
import com.uisrael.servicedesk.service.IRolServices;

@Controller
public class RolController {
	@Autowired
	private IRolServices servRol;
	
	@GetMapping("/roles")
	public String verRoles(Model model) {
		
		List<Rol>listaRoles=servRol.verRol();
		model.addAttribute("listaRoles", listaRoles);
		return "/roles/listaRoles";
		
	}
	
	@GetMapping("/roles/nuevo")
	public String nuevoRol(Model model) {
		model.addAttribute("nuevoRol", new Rol());
		return"/roles/nuevoRol";
	}
	@PostMapping("/roles/guardar")
	public String guardarRol(@ModelAttribute("nuevoRol") Rol nuevo) {
	servRol.inserRol(nuevo);
	return"redirect:/roles";
	}
	@GetMapping("/borrarRol/{id}")
	public String borrarRol(@PathVariable("id") Integer idObjeto) {
		servRol.borrarRol(idObjeto);
		return"redirect:/roles";
	}
	@GetMapping("/editarRol/{id}")
	public String editarRol(@PathVariable("id") Integer idObjeto, Model model) {
		model.addAttribute("nuevoRol", servRol.editarRol(idObjeto));
		return"/roles/nuevoRol";
	
	}
}
