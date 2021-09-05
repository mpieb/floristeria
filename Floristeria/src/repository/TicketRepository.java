package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Ticket;

public class TicketRepository {
	
		private List<Ticket> ticketList = new ArrayList<>();

		public TicketRepository(){
		}
		
		public List<Ticket> getAllTickets(){
			return ticketList;
		}
				
		public void addTicket(Ticket Ticket) {
			ticketList.add(Ticket);
		}		

}
