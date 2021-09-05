package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entity.Producte;
import entity.Ticket;
import utilities.NotEmptyScanner;

public class TicketView {

	private NotEmptyScanner scan = new NotEmptyScanner();

	public Ticket crearTicket(List<Producte> productes) {
		boolean comprar = true;
		List<Producte> compres = new ArrayList<Producte>();

		while (comprar) {
			System.out.println("\nIntrodueix l'ID del producte que vols comprar:");
			int producteId = scan.nextInt();

			Optional<Producte> producte = getProducte(producteId, productes);

			if (producte.isEmpty()) {
				System.out.println("L'ID introduit no existeix.");
			} else if (compres.contains(producte.get())) {
				System.out.println("Ja escollit aquest producte.");
			} else {
				compres.add(producte.get());
			}

			System.out.println("Vols seguir comprant? (S/N):");
			comprar = scan.nextBoolean();
		}

		Ticket ticket = null;

		try {
			ticket = new Ticket(compres);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ticket;
	}

	public void mostrarTickets(List<Ticket> tickets) {
		System.out.println("\nDiners guanyats: " + tickets.stream().mapToDouble(t -> t.getValorTotal()).sum());
		tickets.stream().forEach(ticket -> {
			System.out.print(ticket);
			System.out.println("\t Productes: " + ticket.getProductes());
		});
	}

	private Optional<Producte> getProducte(int producteId, List<Producte> productes) {
		return productes.stream().filter(p -> p.getId() == producteId).findFirst();
	}
}
