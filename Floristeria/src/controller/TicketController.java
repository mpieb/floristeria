package controller;

import entity.Producte;
import repository.TicketRepository;
import view.TicketView;

public class TicketController {
	
	private TicketRepository ticketRepository;
	private RepositoryView repositoryView;
	
	public TicketController() {
		TicketRepository = new TicketRepository();
		TicketView = new TicketView();
	}
	
	public void crearTicket() {
		Ticket ticket = TicketView.crearTicket();
		TicketRepository.crearTicket(ticket);
	}
	
	public void mostrarTicket() {
		ticketView.mostrarTicket(TicketRepository.getAllTickets());
	}

}

	