package Atividade_Avaliativa;

public class Elfo extends Raca {
	// herança da classe Raça
	
	// atributo que cada extensão terá
	private Classes classe;
	
	// construtores
	public Elfo(Classes classe) {
		super("Elfo");
		this.classe=classe;
	}
	
	public Elfo() {
		// atribuindo a string herdada da classe Raça
		super("Elfo");
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
