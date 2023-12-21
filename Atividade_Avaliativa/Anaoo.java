package Atividade_Avaliativa;

public class Anaoo extends Raca {
	// herança da classe Raça
	
	// atributo que cada extensão terá
	private Classes classe;
	
	// constutores
	public Anaoo() {
		// atribuindo a string herdada da classe Raça
		super("Anão");
	}
	
	public Anaoo(Classes classe) {
		super("Anão");
		this.classe=classe;
	}
	
	// set
	public void setClasse(Classes classe) {
		this.classe = classe;
	}
	
	// get
	public Classes getClasse() {
		return classe;
	}
}
