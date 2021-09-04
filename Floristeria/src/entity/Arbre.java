package entity;

public class Arbre extends Producte {
	private double mida;

	public Arbre(String nom, double mida, double preu) throws Exception {
		super(nom, preu);
		if (mida <= 0)
			throw new Exception();
		this.mida = mida;
	}

	public double getMida() {
		return mida;
	}

	public void setMida(double mida) {
		this.mida = mida;
	}

	@Override
	public String toString() {
		return "Arbre [id=" + id + ", nom=" + nom + ", preu=" + preu + ", mida=" + mida + "]";
	}

}
