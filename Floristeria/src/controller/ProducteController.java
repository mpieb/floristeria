package controller;

import entity.Producte;
import repository.ProducteRepository;
import view.ProducteView;

public class ProducteController {

	private ProducteRepository producteRepository;
	private ProducteView producteView;
	
	public ProducteController() {
		producteRepository = new ProducteRepository();
		producteView = new ProducteView();
	}
	
	public void afegirArbre() {
		Producte arbre = producteView.afegirArbre();
		producteRepository.addProducte(arbre);
	}
	
	public void afegirFlor() {
		Producte flor = producteView.afegirFlor();
		producteRepository.addProducte(flor);
	}
	
	public void afegirDecoracio() {
		Producte decoracio = producteView.afegirDecoracio();
		producteRepository.addProducte(decoracio);
	}
	
	public void mostrarStock() {
		producteView.mostrarStock(producteRepository.getProductes());
	}
	
	public void retirarProducte() {
		int producteId = producteView.retirarProducte();
		producteRepository.deleteProducteById(producteId);
	}

}
