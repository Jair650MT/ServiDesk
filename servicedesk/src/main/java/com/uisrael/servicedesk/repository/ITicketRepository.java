package com.uisrael.servicedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.servicedesk.entity.Ticket;
@Repository
public interface ITicketRepository extends JpaRepository<Ticket, Integer>{

}
