package demo;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
	
		private List<Ticket> ticketList = new ArrayList<>();

		public TicketRepository(){
		}
		
		public List<Ticket> getAllTickets(){
			return ticketList;
		}
				
		public void addTicket(Ticket Ticket) throws Exception {
			if(Ticket==null) throw new Exception();
			ticketList.add(Ticket);
		}		

}
