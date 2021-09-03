package entity;

public abstract class Producte {

	protected int id;
	protected String nom;
	protected double preu;

	public Producte(String nom, double preu) throws Exception {
		this.nom = nom;
		this.preu = preu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

}
