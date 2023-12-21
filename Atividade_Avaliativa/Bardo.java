package Atividade_Avaliativa;

import Atividade_Avaliativa.Jogo.Cor;

public class Bardo extends Classes {
	// herança da classe Classes
	
	// constutores
	public Bardo() {
		super("Bardo",null);
	}
	public Bardo(Arma arma) {
		super("Bardo",arma);
	}
	// polimorfismo da função efeitoEspecial na classe Classes, alterando as cores dos efeitos especiais das armas
	@Override
	public void efeitoEspecial(Arma arma) {
		System.out.println("\n"+Cor.ROXO.getCodigo()+arma.getEfeito_Especial()+Cor.BRANCO.getCodigo());
	}
}
