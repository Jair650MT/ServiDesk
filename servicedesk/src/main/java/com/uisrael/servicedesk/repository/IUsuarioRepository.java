package com.uisrael.servicedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.servicedesk.entity.Usuario;
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

}
