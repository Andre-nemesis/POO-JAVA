package Atividade_Avaliativa;

public class Elfo extends Raca {
	private Classes classe;
	
	public Elfo(Classes classe) {
		super("Elfo");
		this.classe=classe;
	}
	
	public Elfo() {
		super("Elfo");
	}
	
	public void setClasse(Classes classe) {
		this.classe = classe;
	}
	
	public Classes getClasse() {
		return classe;
	}
}
