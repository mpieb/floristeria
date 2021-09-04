package entity;

public class Decoracio extends Producte {
	private Material material;

	public Decoracio(String nom, Material material, double preu) throws Exception {
		super(nom, preu);
		if (material == null)
			throw new Exception();
		this.material = material;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Decoracio [id=" + id + ", nom=" + nom + ", preu=" + preu + ", material=" + material + "]";
	}

}
