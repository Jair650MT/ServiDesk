package com.uisrael.servicedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.servicedesk.entity.Proyecto;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Integer>{

}
