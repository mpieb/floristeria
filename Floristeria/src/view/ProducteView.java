package view;

import java.util.Scanner;

import entity.Arbre;
import entity.Decoracio;
import entity.Flor;
import entity.Material;

public class ProducteView {

	private static Scanner scan = new Scanner(System.in);

	public Arbre afegirArbre() {
		System.out.println("Introdueix nom de l'arbre:");
		String nom = scan.nextLine();
		System.out.println("Introdueix el preu:");
		double preu = scan.nextDouble();
		scan.nextLine();
		System.out.println("Introdueix la mida:");
		double mida = scan.nextDouble();
		scan.nextLine();

		Arbre arbre = null;

		try {
			arbre = new Arbre(nom, mida, preu);
		} catch (Exception e) {
			System.out.print("\n--> No has completat bé algun camp <--");
		}

		return arbre;
	}

	public Flor afegirFlor() {
		System.out.println("Introdueix nom de la flor:");
		String nom = scan.nextLine();
		System.out.println("Introdueix el preu:");
		double preu = scan.nextDouble();
		scan.nextLine();
		System.out.println("Introdueix el color:");
		String color = scan.nextLine();

		Flor flor = null;

		try {
			flor = new Flor(nom, color, preu);
		} catch (Exception e) {
			System.out.print("\n--> No has completat bé algun camp <--");
		}

		return flor;
	}

	public Decoracio afegirDecoracio() {
		System.out.println("Introdueix nom de la decoracio:");
		String nom = scan.nextLine();
		System.out.println("Introdueix el preu:");
		double preu = scan.nextDouble();
		scan.nextLine();

		Material material = getMaterial();

		Decoracio decoracio = null;

		try {
			decoracio = new Decoracio(nom, material, preu);
		} catch (Exception e) {
			System.out.print("\n--> No has completat bé algun camp <--");
		}

		return decoracio;
	}

	public void mostrarStock() {
		System.out.println("\n---->>> STOCK (falta implementar) <<<----");
	}

	public Material getMaterial() {
		Material material = null;
		String opcio;
		boolean passed = false;
		while (!passed) {
			System.out.println("Escull el material:\na) Fusta\nb) Plàstic");
			opcio = scan.nextLine();
			switch (opcio.toLowerCase()) {
			case "a":
				material = Material.Fusta;
				passed = true;
				break;
			case "b":
				material = Material.Plastic;
				passed = true;
				break;
			default:
				System.out.println("--> L'opció introduïda no existeix <--");
			}
		}
		return material;
	}
}
