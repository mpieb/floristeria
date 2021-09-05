package entity;

public class Decoracio extends Producte {
	//Declaració de camp de clase
	private Material material;
	
	//Declaració de constructor de clase
	public Decoracio(String nom, Material material, double preu) throws Exception {
		super(nom, preu);
		if (material == null)
			throw new Exception();
		this.material = material;
	}
	
	//Getter
	public Material getMaterial() {
		return material;
	}
	
	//setter
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	//Mètode toString
	@Override
	public String toString() {
		return "Decoracio [id=" + id + ", nom=" + nom + ", preu=" + preu + ", material=" + material + "]";
	}

}
