package view;

import java.util.List;
import java.util.stream.Collectors;

import entity.Arbre;
import entity.Decoracio;
import entity.Flor;
import entity.Material;
import entity.Producte;
import utilities.NotEmptyScanner;

public class ProducteView {

	private static NotEmptyScanner scan = new NotEmptyScanner();

	/**
	 * Vista que demana a l'usuari les dades necessàries per crear un objecte Arbre,
	 * i el retorna.
	 */
	public Arbre afegirArbre() {
		System.out.println("Introdueix nom de l'arbre:");
		String nom = scan.nextLine();
		System.out.println("Introdueix el preu:");
		double preu = scan.nextDouble();
		System.out.println("Introdueix la mida:");
		double mida = scan.nextDouble();

		Arbre arbre = null;

		try {
			arbre = new Arbre(nom, mida, preu);
		} catch (Exception e) {
			System.out.print("\n--> No has completat be algun camp <--");
		}

		return arbre;
	}

	/**
	 * Vista que demana a l'usuari les dades necessàries per crear un objecte Flor,
	 * i el retorna.
	 */
	public Flor afegirFlor() {
		System.out.println("Introdueix nom de la flor:");
		String nom = scan.nextLine();
		System.out.println("Introdueix el preu:");
		double preu = scan.nextDouble();
		System.out.println("Introdueix el color:");
		String color = scan.nextLine();

		Flor flor = null;

		try {
			flor = new Flor(nom, color, preu);
		} catch (Exception e) {
			System.out.print("\n--> No has completat be algun camp <--");
		}

		return flor;
	}

	/**
	 * Vista que demana a l'usuari les dades necessàries per crear un objecte
	 * Decoració, i el retorna.
	 */
	public Decoracio afegirDecoracio() {
		System.out.println("Introdueix nom de la decoracio:");
		String nom = scan.nextLine();
		System.out.println("Introdueix el preu:");
		double preu = scan.nextDouble();

		Material material = getMaterial();

		Decoracio decoracio = null;

		try {
			decoracio = new Decoracio(nom, material, preu);
		} catch (Exception e) {
			System.out.print("\n--> No has completat be algun camp <--");
		}

		return decoracio;
	}

	/** Mètode que mostra per consola l'estoc de productes que té la floristeria. */
	public void mostrarStock(List<Producte> productes) {
		double valorStock = productes.stream().mapToDouble(p -> p.getPreu()).sum();
		List<Producte> arbres = getProductesType(Arbre.class, productes);
		List<Producte> flors = getProductesType(Flor.class, productes);
		List<Producte> decoracions = getProductesType(Decoracio.class, productes);

		System.out.println("\nSTOCK (valor total: " + valorStock + " euros)");
		System.out.println("\tARBRES: " + arbres.size() + " unitats");
		arbres.forEach(p -> System.out.println("\t\t" + p.toString()));
		System.out.println("\tFLORS: " + flors.size() + " unitats");
		flors.forEach(p -> System.out.println("\t\t" + p.toString()));
		System.out.println("\tDECORACIO: " + decoracions.size() + " unitats");
		decoracions.forEach(p -> System.out.println("\t\t" + p.toString()));
	}

	/**
	 * Mètode que demana a l'usuari la introducció d'un ID de producte a retirar i
	 * el retorna.
	 */
	public int retirarProducte() {
		System.out.println("InArbretrodueix l'ID del producte que vols retirar:");
		int producteId = scan.nextInt();
		return producteId;
	}

	/**
	 * Retorna una llista amb un tipus determinat de producte (Arbre, Flor,
	 * Decoració, etc)
	 */
	private List<Producte> getProductesType(Class<?> type, List<Producte> productes) {
		return productes.stream().filter(p -> p.getClass() == type).collect(Collectors.toList());
	}

	/**
	 * Mostra un menú que demana a l'usuari escollir entre dues opcions: Fusta o
	 * Plastic
	 */
	private Material getMaterial() {
		Material material = null;
		String opcio;
		boolean passed = false;
		while (!passed) {
			System.out.println("Escull el material:\na) Fusta\nb) Plastic");
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
				System.out.println("--> L'opcio introduida no existeix <--");
			}
		}
		return material;
	}
}
