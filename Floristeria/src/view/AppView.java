package view;

import controller.ProducteController;
import controller.TicketController;
import entity.Floristeria;
import utilities.NotEmptyScanner;

public class AppView {

	private static NotEmptyScanner scan = new NotEmptyScanner();
	private static boolean run = true;
	private static ProducteController producteController = new ProducteController();
	private static TicketController ticketController = new TicketController();

	public static void main(String[] args) {

		crearFloristeria();

		while (run) {
			menuPrincipal();
		}

	}

	private static void crearFloristeria() {
		Floristeria floristeria = null;
		boolean ok = false;
		while (!ok) {
			System.out.println("\nIntrodueix nom de floristeria: ");
			String nom = scan.nextLine();
			try {
				floristeria = new Floristeria(nom);
				ok = true;
			} catch (Exception e) {
				System.out.println("\n--> Introdueix un nom valid <--");
			}
		}
		System.out.println("\n\nBenvingut a la floristeria: " + floristeria.getNomFloristeria());
	}

	private static void menuPrincipal() {
		System.out.println("\nQue vols fer?\na) Gestionar productes");
		System.out.println("b) Gestionar tickets\nc) Mostrar stock\nd) Sortir");

		String opcio = scan.nextLine();

		switch (opcio.toLowerCase()) {
		case "a":
			gestionarProductes();
			break;
		case "b":
			gestionarTickets();
			break;
		case "c":
			producteController.mostrarStock();
			break;
		case "d":
			System.out.println("\n--> Programa finalitzat. <--");
			run = false;
			break;
		default:
			System.out.println("--> L'opcio introduida no existeix. <--");
		}
	}

	private static void gestionarProductes() {
		System.out.println("\nGESTIONAR PRODUCTES:");
		System.out.println("a) Afegir arbre\nb) Afegir flor");
		System.out.println("c) Afegir decoracio\nd) Retirar producte");

		String opcio = scan.nextLine();

		switch (opcio.toLowerCase()) {
		case "a":
			producteController.afegirArbre();
			break;
		case "b":
			producteController.afegirFlor();
			break;
		case "c":
			producteController.afegirDecoracio();
			break;
		case "d":
			producteController.retirarProducte();
			break;
		default:
			System.out.println("--> L'opcio introduida no existeix. <--");
		}
	}

	private static void gestionarTickets() {
		System.out.println("\nGESTIONAR TICKETS:");
		System.out.println("a) Crear ticket\nb) Mostrar tickets");

		String opcio = scan.nextLine();

		switch (opcio.toLowerCase()) {
		case "a":
			ticketController.crearTicket();
			break;
		case "b":
			ticketController.mostrarTickets();
			break;
		default:
			System.out.println("--> L'opcio introduida no existeix. <--");
		}
	}

}
