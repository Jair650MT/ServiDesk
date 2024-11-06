package com.uisrael.servicedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.servicedesk.entity.Comentario;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario, Integer>{

}