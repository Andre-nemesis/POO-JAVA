package Atividade_Avaliativa;

public class Anaoo extends Raca {
	private Classes classe;
	
	public Anaoo() {
		super("Anão");
	}
	
	public Anaoo(Classes classe) {
		super("Anão");
		this.classe=classe;
	}
	
	public void setClasse(Classes classe) {
		this.classe = classe;
	}
	
	public Classes getClasse() {
		return classe;
	}
}
