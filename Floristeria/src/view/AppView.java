package view;

import java.util.Scanner;

import controller.ProducteController;
import entity.Floristeria;

public class AppView {

	private static Scanner scan = new Scanner(System.in);
	private static boolean run = true;
	private static ProducteController producteController = new ProducteController();

	public static void main(String[] args) {

		crearFloristeria();

		while (run) {
			menuPrincipal();
		}

	}

	private static void crearFloristeria() {
		Floristeria floristeria = null;
		boolean ok = false;
		while(!ok) {
			System.out.println("\nIntrodueix nom de floristeria: ");
			String nom = scan.nextLine();
			try {
				floristeria = new Floristeria(nom);
				ok = true;
			} catch (Exception e) {
				System.out.println("\n--> Introdueix un nom vàlid <--");
			}
		}
		System.out.println("\n\nBenvingut a la floristeria: " + floristeria.getNomFloristeria());
	}

	private static void menuPrincipal() {
		System.out.println("\nQuè vols fer?\na) Afegir arbre");
		System.out.println("b) Afegir flor\nc) Afegir decoració\nd) Retirar producte");
		System.out.println("e) Mostrar stock\nf) Sortir");

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
			//producteController.retirarProducte();
			break;
		case "e":
			producteController.mostrarStock();
			break;
		case "f":
			System.out.println("\n--> Programa finalitzat. <--");
			run = false;
			break;
		default:
			System.out.println("--> L'opció introduïda no existeix. <--");
		}
	}

}
