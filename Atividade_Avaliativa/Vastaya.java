package Atividade_Avaliativa;

public class Vastaya extends Raca {
	// herança da classe Raça
	
	// atributo que cada extensão terá
	private Classes classe;
	
	// construtores
	public Vastaya() {
		// atribuindo a string herdada da classe Raça
		super("Vastaya");
	}
	
	public Vastaya(Classes classe) {
		super("Vastaya");
		this.classe=classe;
	}
	
	// get
	public Classes getClasse() {
		return classe;
	}
	 
	// set
	public void setClasse(Classes classe) {
		this.classe = classe;
	}
}
