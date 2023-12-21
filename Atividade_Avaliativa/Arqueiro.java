package Atividade_Avaliativa;

import Atividade_Avaliativa.Jogo.Cor;

public class Arqueiro extends Classes{
	// herança da classe Classes
	
	// constutores
	public Arqueiro() {
		super("Arqueiro",null);
	}
	public Arqueiro(Arma arma) {
		super("Arqueiro",arma);
	}

	// polimorfismo da função efeitoEspecial na classe Classes, alterando as cores dos efeitos especiais das armas
	@Override
	public void efeitoEspecial(Arma arma) {
		System.out.println("\n"+Cor.AZUL.getCodigo()+arma.getEfeito_Especial()+Cor.BRANCO.getCodigo());
	}
}
