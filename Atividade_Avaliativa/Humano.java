package Atividade_Avaliativa;

public class Humano extends Raca {
	// herança da classe Raça
	
	// atributo que cada extensão terá
	private Classes classe;
	
	// contrutores
	public Humano(Classes classe) {
		super("Humano");
		this.classe=classe;
	}
	
	public Humano() {
		// atribuindo a string herdada da classe Raça
		super("Humano");
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
