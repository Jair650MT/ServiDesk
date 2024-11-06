package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.servicedesk.entity.Empleado;
import com.uisrael.servicedesk.repository.IEmpleadoRepository;
import com.uisrael.servicedesk.service.IEmpleadoServices;

@Service
@Component
public class EmpleadoServicesImpl implements IEmpleadoServices{
	
	@Autowired
	private IEmpleadoRepository repoEmple;
	@Override
	public void InsertEmpleado(Empleado nuevoEmpleado) {
		// TODO Auto-generated method stub
		repoEmple.save(nuevoEmpleado);
	}

	@Override
	public List<Empleado> verEmpleado() {
		// TODO Auto-generated method stub
		return repoEmple.findAll();
	}

	@Override
	public void borrarEmpleado(Integer id) {
		// TODO Auto-generated method stub
		repoEmple.deleteById(id);
	}

	@Override
	public Optional<Empleado> EditarEmpleado(Integer id) {
		// TODO Auto-generated method stub
		return repoEmple.findById(id);
	}

}
