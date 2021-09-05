package entity;

public class Floristeria {
	//Declaració de camps de clase
	private String nomFloristeria;
	
	//Declaració de constructor de clase
	public Floristeria(String nomFloristeria) throws Exception {
		if (nomFloristeria.equals("")) throw new Exception();
        this.nomFloristeria = nomFloristeria;
	}
	
	//Getter
	public String getNomFloristeria() {
		return nomFloristeria;
	}
	
	//Setter
	public void setNomFloristeria(String nomFloristeria) {
		this.nomFloristeria = nomFloristeria;
	}

}
