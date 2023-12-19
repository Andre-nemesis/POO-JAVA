package Atividade_Avaliativa;

public class Vastaya extends Raca {
	private Classes classe;
	
	public Vastaya() {
		super("Vastaya");
	}
	
	public Vastaya(Classes classe) {
		super("Vastaya");
		this.classe=classe;
	}
	public Classes getClasse() {
		return classe;
	}
	protected void setClasse(Classes classe) {
		this.classe = classe;
	}
}
