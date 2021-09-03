package entity;

public class Flor extends Producte {
	private String color;

    public Flor(String nom, String color, double preu) throws Exception {
        super(nom, preu);
        if (color.equals("")) throw new Exception();
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

}


