package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Ticket;

public class TicketRepository {
		//Declaració i instanciació de llista Ticket
		private List<Ticket> ticketList = new ArrayList<>();
		
		//Constructor per defecte
		public TicketRepository(){
		}
		
		//Getter
		public List<Ticket> getAllTickets(){
			return ticketList;
		}
		
		//Mètode per afegir tickets
		public void addTicket(Ticket Ticket) {
			ticketList.add(Ticket);
		}		

}
