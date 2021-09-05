package controller;

import entity.Producte;
import repository.ProducteRepository;
import view.ProducteView;

public class ProducteController {

	private ProducteRepository producteRepository;
	private ProducteView producteView;

	/** Metode contructor */
	public ProducteController() {
		producteRepository = new ProducteRepository();
		producteView = new ProducteView();
	}

	/**
	 * Mètode que guarda al repositori un objecte arbre rebut des de la vista.
	 */
	public void afegirArbre() {
		Producte arbre = producteView.afegirArbre();
		producteRepository.addProducte(arbre);
	}

	/**
	 * Mètode que guarda al repositori un objecte flor rebut des de la vista.
	 */
	public void afegirFlor() {
		Producte flor = producteView.afegirFlor();
		producteRepository.addProducte(flor);
	}

	/**
	 * Mètode que guarda al repositori un objecte decoracio rebut des de la vista.
	 */
	public void afegirDecoracio() {
		Producte decoracio = producteView.afegirDecoracio();
		producteRepository.addProducte(decoracio);
	}

	/**
	 * Mètode carrega la vista per mostrar per consola l'estoc de la floristeria.
	 */
	public void mostrarStock() {
		producteView.mostrarStock(producteRepository.getProductes());
	}

	/**
	 * Mètode que elimina del repositori un objecte segons l'ID rebut des de la
	 * vista.
	 */
	public void retirarProducte() {
		int idProducte = producteView.retirarProducte();
		producteRepository.deleteProducteById(idProducte);
	}

}
