package Atividade_Avaliativa;

import Atividade_Avaliativa.Jogo.Cor;

public class Guerreiro extends Classes {
	// herança da classe Classes
	
	// constutores
	public Guerreiro(Arma arm) {
		super("Guerreiro",arm);
	}
	
	public Guerreiro() {
		super("Guerreiro",null);
	}
	// polimorfismo da função efeitoEspecial na classe Classes, alterando as cores dos efeitos especiais das armas
	@Override
	public void efeitoEspecial(Arma arma) {
		System.out.println("\n"+Cor.VERMELHO.getCodigo()+arma.getEfeito_Especial()+Cor.BRANCO.getCodigo());
	}
}
