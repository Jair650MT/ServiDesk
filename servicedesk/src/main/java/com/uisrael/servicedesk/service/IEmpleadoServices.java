package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Empleado;

public interface IEmpleadoServices {
	
	public void InsertEmpleado(Empleado nuevoEmpleado);
	public List<Empleado>verEmpleado();
	public void borrarEmpleado(Integer id);
	public Optional<Empleado>EditarEmpleado(Integer id);
	
}
