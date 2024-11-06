package com.uisrael.servicedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.servicedesk.entity.Estado;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado, Integer>{

}
