package entity;

public abstract class Producte {
	//Declaració de variables 
	protected int id;
	protected String nom;
	protected double preu;
	
	//Declaració de constructor
	public Producte(String nom, double preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	//Getter
	public int getId() {
		return id;
	}
	
	//Setter
	public void setId(int id) {
		this.id = id;
	}
	
	//Getter
	public String getNom() {
		return nom;
	}
	
	//Setter
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//Getter
	public double getPreu() {
		return preu;
	}
	
	//Setter
	public void setPreu(double preu) {
		this.preu = preu;
	}
}
