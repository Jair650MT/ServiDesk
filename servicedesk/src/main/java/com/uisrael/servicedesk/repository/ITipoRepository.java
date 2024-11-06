package com.uisrael.servicedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.servicedesk.entity.Tipo;

@Repository
public interface ITipoRepository extends JpaRepository<Tipo, Integer>{

}
