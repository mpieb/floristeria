package repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import entity.Producte;

public class ProducteRepository {

	private static int counter;
	private static List<Producte> productes;

	public ProducteRepository() {
		counter = 1;
		productes = new ArrayList<Producte>();
	}

	/** Retorna una llista amb tots els productes */
	public List<Producte> getProductes() {
		return productes;
	}

	/** Retorna un producte pel seu ID */
	public Producte getProducteById(int id) {
		return productes.stream()
				.filter(p -> p.getId() == id)
				.collect(Collectors.toList()).get(0);
	}

	/** Asigna un ID al producte i l'afegeix a la llista */
	public void addProducte(Producte producte) {
		producte.setId(counter);
		counter++;
		productes.add(producte);
	}

	/** Elimina un producte pel seu ID */
	public Producte deleteProducteById(int id) {
		Producte producte = null;
		Iterator<Producte> itr = productes.iterator();
		while (itr.hasNext()) {
			producte = itr.next();
			if (producte.getId() == id) {
				itr.remove();
				break;
			}
		}
		return producte;
	}
}
