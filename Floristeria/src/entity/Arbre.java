package entity;

public class Arbre extends Producte {
	private double alçada;

	public Arbre(String nom, double alçada, double preu ) throws Exception {
		super(nom, preu);
        if (alçada <= 0) throw new Exception();
        this.alçada = alçada;
    }

    public void setAlçada(double alçada){
        this.alçada = alçada;
    }

    public double getAlçada() {
        return alçada;
    }
	
}



