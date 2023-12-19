package Atividade_Avaliativa;

public class Anao extends Raca{
	private Classes classe;
	
	public Anao(String nome,Classes classe) {
		super(nome);
		this.classe=classe;
	}
	
	public Classes getClasse() {
		return classe;
	}
	
	public void setClasse(Classes classe) {
		this.classe = classe;
	}	
}
