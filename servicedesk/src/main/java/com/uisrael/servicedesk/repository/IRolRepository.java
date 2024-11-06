package com.uisrael.servicedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.servicedesk.entity.Rol;
@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{

}
