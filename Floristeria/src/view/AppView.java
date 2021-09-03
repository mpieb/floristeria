package view;

import java.util.Scanner;

public class AppView {

	private static Scanner scan = new Scanner(System.in);
	private static boolean run = true;
	
	public static void main(String[] args) {
		
		crearFloristeria();
		
		while (run) {
			menuPrincipal();
		}
		
	}
	
	private static void crearFloristeria() {
		System.out.println("Introdueix nom de floristeria: ");
		String nom = scan.nextLine();
		System.out.println("\n\nBenvingut a la floristeria: " + nom);
	}
	
	private static void menuPrincipal() {
		System.out.println("\nQuè vols fer?\na) Afegir arbre");
		System.out.println("b) Afegir flor\nc) Afegir decoració");
		System.out.println("d) Mostrar stock\ne) Sortir");
		
		String opcio = scan.nextLine();

		switch (opcio.toLowerCase()) {
		case "a":
			System.out.println("\nExecutar ProductesController.afegirArbre()");
			break;
		case "b":
			System.out.println("\nExecutar ProductesController.afegirFlor()");
			break;
		case "c":
			System.out.println("\nExecutar ProductesController.afegirDecoracio()");
			break;
		case "d":
			System.out.println("\nExecutar ProductesController.mostrarStock()");
			break;
		case "e":
			System.out.println("\n--> Programa finalitzat. <--");
			run = false;
			break;
		default:
			System.out.println("--> L'opció introduïda no existeix. <--");
		}
	}

}