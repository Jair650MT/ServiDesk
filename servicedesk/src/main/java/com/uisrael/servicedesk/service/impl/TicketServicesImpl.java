package com.uisrael.servicedesk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.servicedesk.entity.Ticket;
import com.uisrael.servicedesk.repository.ITicketRepository;
import com.uisrael.servicedesk.service.ITicketServices;

@Service
@Component
public class TicketServicesImpl implements ITicketServices{
	@Autowired
	private ITicketRepository repoTic;
	@Override
	public void insertTicket(Ticket nuevoTicket) {
		// TODO Auto-generated method stub
		repoTic.save(nuevoTicket);
	}

	@Override
	public List<Ticket> verTickets() {
		// TODO Auto-generated method stub
		return repoTic.findAll();
	}

	@Override
	public void BorrarTickets(Integer id) {
		// TODO Auto-generated method stub
		repoTic.deleteById(id);
	}

	@Override
	public Optional<Ticket> editarTickets(Integer id) {
		// TODO Auto-generated method stub
		return repoTic.findById(id);
	}

}
