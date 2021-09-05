package entity;

public class Arbre extends Producte {
	//Declaració de camp de clase
	private double mida;
	
	//Declaració de constructor de clase
	public Arbre(String nom, double mida, double preu) throws Exception {
		super(nom, preu);
		if (mida <= 0)
			throw new Exception();
		this.mida = mida;
	}

	//Getter
	public double getMida() {
		return mida;
	}
	
	//Setter
	public void setMida(double mida) {
		this.mida = mida;
	}
	
	//Mètode toString
	@Override
	public String toString() {
		return "Arbre [id=" + id + ", nom=" + nom + ", preu=" + preu + ", mida=" + mida + "]";
	}

}
