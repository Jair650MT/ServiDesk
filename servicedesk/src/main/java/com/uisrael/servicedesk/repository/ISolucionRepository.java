package com.uisrael.servicedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.servicedesk.entity.Solucion;

@Repository
public interface ISolucionRepository extends JpaRepository<Solucion, Integer>{

}
