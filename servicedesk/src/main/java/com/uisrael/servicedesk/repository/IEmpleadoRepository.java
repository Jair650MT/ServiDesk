package com.uisrael.servicedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.servicedesk.entity.Empleado;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer>{

}
