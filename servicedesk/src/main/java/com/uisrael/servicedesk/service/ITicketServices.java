package com.uisrael.servicedesk.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.servicedesk.entity.Ticket;

public interface ITicketServices {
	
	public void insertTicket(Ticket nuevoTicket);
	public List<Ticket>verTickets();
	public void BorrarTickets(Integer id);
	public Optional<Ticket>editarTickets(Integer id);
}
