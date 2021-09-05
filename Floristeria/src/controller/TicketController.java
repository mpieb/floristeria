package controller;

import entity.Ticket;
import repository.ProducteRepository;
import repository.TicketRepository;
import view.TicketView;

public class TicketController {
	
	private ProducteRepository producteRepository;
	private TicketRepository ticketRepository;
	private TicketView ticketView;
	
	public TicketController() {
		producteRepository = new ProducteRepository();
		ticketRepository = new TicketRepository();
		ticketView = new TicketView();
	}
	
	public void crearTicket() {
		Ticket ticket = ticketView.crearTicket(producteRepository.getProductes());
		
		ticket.getProductes().forEach(p -> producteRepository.deleteProducteById(p.getId()));
		
		ticketRepository.addTicket(ticket);
	}
	
	public void mostrarTickets() {
		ticketView.mostrarTickets(ticketRepository.getAllTickets());
	}

}

	