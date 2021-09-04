package view;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entity.Arbre;
import entity.Decoracio;
import entity.Flor;
import entity.Material;
import entity.Producte;

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

	public void mostrarStock(List<Producte> productes) {
		List<Producte> arbres = getProductesType(Arbre.class, productes);
		List<Producte> flors = getProductesType(Flor.class, productes);
		List<Producte> decoracions = getProductesType(Decoracio.class, productes);
		
		System.out.println("\nSTOCK");
		System.out.println("\tARBRES: " + arbres.size());
		arbres.forEach(p -> System.out.println("\t\t" + p.toString()));
		System.out.println("\tFLORS: " + flors.size());
		flors.forEach(p -> System.out.println("\t\t" + p.toString()));
		System.out.println("\tDECORACIO: " + decoracions.size());
		decoracions.forEach(p -> System.out.println("\t\t" + p.toString()));
	}
	
	public int retirarProducte() {
		System.out.println("Introdueix l'ID del producte que vols retirar:");
		int producteId = scan.nextInt();
		scan.nextLine();
		return producteId;
	}

	/**
	 * Retorna una llista amb un tipus determinat de producte (Arbre, Flor,
	 * Decoració, etc)
	 */
	public List<Producte> getProductesType(Class<?> type, List<Producte> productes) {
		return productes.stream().filter(p -> p.getClass() == type).collect(Collectors.toList());
	}

	/**
	 * Mostra un menú que demana a l'usuari escollir entre dues opcions: Fusta o
	 * Plastic
	 */
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
