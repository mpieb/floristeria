package entity;

public class Decoracio extends Producte{
	private String material;

    public Decoracio (String nom, String material, double preu) throws Exception {
        super(nom, preu);
        if (material == null) throw new Exception();
        this.material = material;
    }
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

}
