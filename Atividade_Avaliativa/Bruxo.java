package Atividade_Avaliativa;

import Atividade_Avaliativa.Jogo.Cor;

public class Bruxo extends Classes {
	// herança da classe Classes
	
	// constutores
	public Bruxo() {
		super("Bruxo",null);
	}
	
	public Bruxo(Arma arma) {
		super("Bruxo",arma);
	}
	
	// polimorfismo da função efeitoEspecial na classe Classes, alterando as cores dos efeitos especiais das armas
	@Override
	public void efeitoEspecial(Arma arma) {
		System.out.println("\n"+Cor.CIANO.getCodigo()+arma.getEfeito_Especial()+Cor.BRANCO.getCodigo());
	}
}
