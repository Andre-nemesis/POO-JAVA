package Atividade_Avaliativa;

import Atividade_Avaliativa.Jogo.Cor;

public class Clerigo extends Classes {
	// herança da classe Classes
	
	// constutores
	public Clerigo(Arma arm) {
		super("Clerigo",arm);
	}
	public Clerigo() {
		super("Clerigo",null);
	}
	// polimorfismo da função efeitoEspecial na classe Classes, alterando as cores dos efeitos especiais das armas
	@Override
	public void efeitoEspecial(Arma arma) {
		System.out.println("\n"+Cor.AMARELO.getCodigo()+arma.getEfeito_Especial()+Cor.BRANCO.getCodigo());
	}
}
