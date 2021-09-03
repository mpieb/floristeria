package entity;

public class Floristeria {
	private String nomFloristeria;
	
	public Floristeria(String nomFloristeria) throws Exception {
		if (nomFloristeria.equals("")) throw new Exception();
        this.nomFloristeria = nomFloristeria;
	}
	
	public String getNomFloristeria() {
		return nomFloristeria;
	}
	
	public void setNomFloristeria(String nomFloristeria) {
		this.nomFloristeria = nomFloristeria;
	}

}
