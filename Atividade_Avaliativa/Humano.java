package Atividade_Avaliativa;

public class Humano extends Raca {
	private Classes classe;
	
	public Humano(Classes classe) {
		super("Humano");
		this.classe=classe;
	}
	
	public Humano() {
		super("Humano");
	}
	
	public Classes getClasse() {
		return classe;
	}
	
	public void setClasse(Classes classe) {
		this.classe = classe;
	}
}
